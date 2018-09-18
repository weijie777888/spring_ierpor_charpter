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
		
		emp.setDept(new Dept("巨头"));
		emp.setEname("马云");
		emp.setJob("阿里巴巴");
		emp.setSal(1000);
		
		emp2.setDept(new Dept("巨头1"));
		emp2.setEname("马化腾");
		emp2.setJob("腾讯");
		emp2.setSal(2000);
		
		List<Emp> emps=new ArrayList<Emp>();
		
		emps.add(emp);
		emps.add(emp2);	
		
		JRBeanCollectionDataSource beanCollectionDataSource =new JRBeanCollectionDataSource(emps);
		
		Map<String, Object> map=new HashMap<>();
		
		//这里是设置报表的参数 必须和JRXML 中的parameter name 一致11111111111111111111111111111		
		map.put("emp", new Emp());
		
		//绑定到Spring容器中的bean
		map.put("datasource", beanCollectionDataSource);
		//这里设置的就是Spring容器中对应组件名比如我要打印PDF
		model.setViewName("pdfReport");
		
		model.addAllObjects(map);
		return model;
	}
}
