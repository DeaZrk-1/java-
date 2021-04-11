package Employee;

public class Administrator extends Employee{
	private float bonus;

	public Administrator(String id, String name, String department, float baseSalary, float bonus) {
		super(id, name, department, baseSalary);
		this.bonus = bonus;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}	
	public void updateSalary(){
		super.updateSalary();
		super.setBaseSalary(super.getBaseSalary()+this.bonus);
	}
	public String toString(){
		String msg;
		msg="Administrator[bonus="+bonus+",toString"+super.toString()+"]";
		return msg;
	}
	

}
