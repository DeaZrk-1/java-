package Subject;

import java.util.Scanner;

public class SubjectEnrolmentDriver {
	public static Scanner scan=new Scanner (System.in);
	public static SubjectEnrolment list1=null;
	public static Subject sub=null;
	public static Stu stu=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=menu();
		while(choice!=5)
		{
			switch(choice){
			case 1:creatSubject();break;
			case 2:select();break;
			case 3:remove();break;
			case 4:display();break;
			}
			choice=menu();
		}

	}
	
	public static int menu(){
		int choice;
		System.out.println("===选课系统===");
		System.out.println("1.创建课程");
		System.out.println("2.选课");
		System.out.println("3.退选");
		System.out.println("4.打印名单");
		System.out.println("5.退出");
		System.out.println("请输入选择");
		choice=scan.nextInt();
		if(choice!=1 && list1==null)
		{
			System.out.println("请先创建课程,以自动选择为1");
			choice=1;
		}
		if(choice==2 && list1.length()==list1.size())
		{
			System.out.println("已达最大选课人数");
			choice=menu();
		}
		return choice;
	}
	public static void creatSubject(){
		String i;
		if(list1!=null)
		{
			System.out.println("课程已经存在，是否重新创建(y/n)");
			i=scan.next();
			if(i.equals("n"))
				return ;
		}
		String subjectId,subjectName;
		int number;
		System.out.println("请输入课程id:");
		subjectId=scan.next();
		System.out.println("请输入课程名称:");
		subjectName=scan.next();
		System.out.println("请输入课程人数:");
		number=scan.nextInt();
		sub=new Subject(subjectId,subjectName,number);
		System.out.println(sub.toString());
		list1=new SubjectEnrolment(sub);
	}
	public static void select(){
		String id,name;
		System.out.println("请输入学生id:");
		id=scan.next();
		System.out.println("请输入学生姓名:");
		name=scan.next();
		stu=new Stu(id,name);
		list1.add(stu);
		System.out.println("选课成功");
		display();
	}
	public static void remove() {
		String id;
		System.out.println("请输入学生的id");
		id=scan.next();
		if(list1.indexof(id)==-1)
		{
			 System.out.println("学号为"+id+"的学生没有选课");
			 return ;
		}
		list1.remove(list1.indexof(id));
		System.out.println("退选成功，目前的选课信息如下");
		display();
	}
	public static void display() {
		System.out.println("目前的选课信息如下:");
		System.out.println(sub.toString());
		System.out.println(list1.toString());
	}
}
