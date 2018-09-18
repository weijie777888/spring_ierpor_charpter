package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import entity.Dept;
import entity.Emp;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Controller
@RequestMapping("/test.action")
public class EmpController {

	@RequestMapping(params="method=print")
	public ModelAndView printReport() {
		ModelAndView model=new ModelAndView();
		Emp emp=new Emp();
		Emp emp2=new Emp();
		
		emp.setDept(new Dept("��ͷ"));
		emp.setEname("����");
		emp.setJob("����Ͱ�");
		emp.setSal(1000);
		
		emp2.setDept(new Dept("��ͷ1"));
		emp2.setEname("����");
		emp2.setJob("��Ѷ");
		emp2.setSal(2000);
		
		List<Emp> emps=new ArrayList<Emp>();
		
		emps.add(emp);
		emps.add(emp2);	
		
		JRBeanCollectionDataSource beanCollectionDataSource =new JRBeanCollectionDataSource(emps);
		
		Map<String, Object> map=new HashMap<>();
		
		//���������ñ���Ĳ��� �����JRXML �е�parameter name һ��		
		map.put("emp", new Emp());
		
		//�󶨵�Spring�����е�bean
		map.put("datasource", beanCollectionDataSource);
		//�������õľ���Spring�����ж�Ӧ�����������Ҫ��ӡPDF
		model.setViewName("pdfReport");
		
		model.addAllObjects(map);
		return model;
	}
}
