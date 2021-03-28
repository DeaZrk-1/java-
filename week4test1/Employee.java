package week4;

public class Employee {
	private String name;
	private int id;
	private String department;
	private float baseSalary;
	
	
	public Employee(){
		
	}
	public Employee(String name,int id,
			String department,float baseSalary){
		this.name=name;
		this.id=id;
		this.department=department;
		this.baseSalary=baseSalary;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
		
	}
	public float getBaseSalary(){
		return baseSalary;
	}
	public void setBaseSalary(float baseSalary){
		this.baseSalary=baseSalary;
	}
	public void updateSalary(){
		this.baseSalary=baseSalary*1.035f;
	}
	public void displayEmployee(){
		String msg;
		msg="id"+this.id;
		msg+="name:"+this.name;
		msg+="department:"+this.department;
		msg+="baseSalary:"+this.baseSalary;
		System.out.println(msg);
	}

}
