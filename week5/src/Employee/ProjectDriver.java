package Employee;

import java.util.Scanner;

public class ProjectDriver {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("��������Ŀ����:");
		String projectName=scan.next();
		
		System.out.println("��ĿԤ��:");
		double budget =scan.nextDouble();
		
		System.out.println("������Ա��1����:");
		String emp1Name=scan.next();
		System.out.println("������Ա��1����:");
		String emp1Department=scan.next();
		System.out.println("������Ա��1��н:");
		float baseSalary1=scan.nextFloat();
		
		System.out.println("������Ա��2����:");
		String emp2Name=scan.next();
		System.out.println("������Ա��2����:");
		String emp2Department=scan.next();
		System.out.println("������Ա��2��н:");
		float baseSalary2=scan.nextFloat();
		
		Employee emp1=new Employee(emp1Name,emp1Department,baseSalary1);
		Employee emp2=new Employee(emp2Name,emp2Department,baseSalary2);
		
		Project project=new Project(projectName,budget,emp1,emp2);
		System.out.println(project.toString());
		
		project.updateBudget();
		System.out.println("��Ԥ��Ϊ:"+project.getBudget());
		System.out.println(project.toString());
	}
}
