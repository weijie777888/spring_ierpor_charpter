package entity;

public class Emp {
	public final String enameTitle="员工名";
	public final String salTitle="工资";
	public final String jobTitle="工作";
	public final String dnameTitle="部门名";
	
	private String ename;
	private int sal;
	private String job;
	private Dept dept;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public String getEnameTitle() {
		return enameTitle;
	}
	public String getSalTitle() {
		return salTitle;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public String getDnameTitle() {
		return dnameTitle;
	}
	
	
}
