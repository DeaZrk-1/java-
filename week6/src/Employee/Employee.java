package Employee;

public class Employee {
	private String id;
	private String name;
	private String department;
	private float baseSalary;
	
	public Employee(String id,String name,String department,float baseSalary)
	{
		this.id=id;
		this.name=name;
		this.department=department;
		this.baseSalary=baseSalary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		String msg;
		msg="id"+this.id;
		msg+=",name"+this.name;
		msg+=",department"+this.department;
		msg+=",baseSalary"+this.baseSalary;
		return msg;
	}
	public void updateSalary(){
		this.baseSalary=this.baseSalary*1.075f;
	}

}
