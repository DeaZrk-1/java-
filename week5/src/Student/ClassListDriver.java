package Student;

import java.util.Scanner;

public class ClassListDriver {
	private static ClassList list=null;

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean st;
		
		int choose=menu();
		
		while(choose!=3){
			switch(choose)
			{
			case 1:creatList();break;
			case 2:
				if(list==null)
				{
					System.out.println("请先输入信息:");
					break;
				}
				System.out.println(list.toString);
			default:System.out.println("无效的选择!");
			}
			choose=menu();
		}
		System.out.println("欢迎下次使用!");
		// TODO Auto-generated method stub

	}
	
	public static int menu(){
		int choose=0;
		System.out.println("====选课系统====");
		System.out.println("1.creatList");
		System.out.println("2.printList");
		System.out.println("3.exit");
		System.out.println("please Enter your choose");
		Scanner scan=new Scanner(System.in);
		choose=scan.nextInt();
		return choose;
	}
	public static void creatList(){
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入学年:");
		int year=scan.nextInt();
		System.out.println("请输入学期:");
		int semester=scan.nextInt();
		System.out.println("请输入课程代码:");
		String subjectid=scan.next();
		System.out.println("请输入课程名称:");
		String subjectName=scan.next();
		System.out.println("请输入学生1的编号");
		String id1=scan.next();
		System.out.println("请输入学生1的名字:");
		String name1=scan.next();
		System.out.println("请输入学生2的编号");
		String id2=scan.next();
		System.out.println("请输入学生2的名字:");
		String name2=scan.next();
		Subject sub=new Subject(subjectid,subjectName);
		Student stu1=new Student(id1,name1);
		Student stu2=new Student(id2,name2);
		list=new ClassList(semester,year,sub,stu1,stu2);
		
	}
	public static void printList(){
		System.out.println(list.toString());
	}

}
