package week4;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee emp1=new Employee("john",1002,"����",2500);
		Employee emp2=new Employee("tom",1001,"����",2000);
		
		float oldSalary=emp1.getBaseSalary();
		System.out.println("Ա��1����Ϊ:"+oldSalary);
		emp1.displayEmployee();
		emp1.updateSalary();
		float newSalary=emp1.getBaseSalary();
		System.out.println("��н��Ա��1����Ϊ:"+newSalary);
	}
}
