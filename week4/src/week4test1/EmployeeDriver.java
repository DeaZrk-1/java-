package week4;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee emp1=new Employee("john",1002,"财务",2500);
		Employee emp2=new Employee("tom",1001,"销售",2000);
		
		float oldSalary=emp1.getBaseSalary();
		System.out.println("员工1工资为:"+oldSalary);
		emp1.displayEmployee();
		emp1.updateSalary();
		float newSalary=emp1.getBaseSalary();
		System.out.println("加薪后员工1工资为:"+newSalary);
	}
}
