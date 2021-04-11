package Employee;

public class SalePerson extends Employee{
	private float yearlySales;

	public float getYearlySales() {
		return yearlySales;
	}

	public void setYearlySales(float yearlySales) {
		this.yearlySales = yearlySales;
	}

	public SalePerson(String id, String name, String department, float baseSalary, float yearlySales) {
		super(id, name, department, baseSalary);
		this.yearlySales = yearlySales;
	}
	public void updateSalary()
	{
		super.updateSalary();
		super.setBaseSalary(super.getBaseSalary()+this.yearlySales*0.1f);
	}
	public String toString()
	{
		String msg;
		msg="SalePerson[yearlySales"+yearlySales+",toString"+super.toString()+"]";
		return msg;
	}

}
