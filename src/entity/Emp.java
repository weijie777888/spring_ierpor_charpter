package entity;

public class Emp {
	public final String enameTitle="Ա����";
	public final String salTitle="����";
	public final String jobTitle="����";
	public final String dnameTitle="������";
	
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
