package Employee;

import java.util.Scanner;

public class ProjectDriver {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入项目名称:");
		String projectName=scan.next();
		
		System.out.println("项目预算:");
		double budget =scan.nextDouble();
		
		System.out.println("请输入员工1姓名:");
		String emp1Name=scan.next();
		System.out.println("请输入员工1部门:");
		String emp1Department=scan.next();
		System.out.println("请输入员工1底薪:");
		float baseSalary1=scan.nextFloat();
		
		System.out.println("请输入员工2姓名:");
		String emp2Name=scan.next();
		System.out.println("请输入员工2部门:");
		String emp2Department=scan.next();
		System.out.println("请输入员工2底薪:");
		float baseSalary2=scan.nextFloat();
		
		Employee emp1=new Employee(emp1Name,emp1Department,baseSalary1);
		Employee emp2=new Employee(emp2Name,emp2Department,baseSalary2);
		
		Project project=new Project(projectName,budget,emp1,emp2);
		System.out.println(project.toString());
		
		project.updateBudget();
		System.out.println("新预算为:"+project.getBudget());
		System.out.println(project.toString());
	}
}
