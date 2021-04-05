package Employee;

public class Employee {
	private String id;
	private String name;
	private String department;
	private float baseSalary;
	
	public Employee(){
	}
	public Employee(String name,String department,float baseSalary){
		this.name=name;
		this.department=department;
		this.baseSalary=baseSalary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}
	public String toString(){
		String info="";
		info="name"+this.name;
		info=info+"department"+this.department;
		info=info+"baseSalary"+this.baseSalary;
		return info;
	}

}
