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
					System.out.println("����������Ϣ:");
					break;
				}
				System.out.println(list.toString);
			default:System.out.println("��Ч��ѡ��!");
			}
			choose=menu();
		}
		System.out.println("��ӭ�´�ʹ��!");
		// TODO Auto-generated method stub

	}
	
	public static int menu(){
		int choose=0;
		System.out.println("====ѡ��ϵͳ====");
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
		System.out.println("������ѧ��:");
		int year=scan.nextInt();
		System.out.println("������ѧ��:");
		int semester=scan.nextInt();
		System.out.println("������γ̴���:");
		String subjectid=scan.next();
		System.out.println("������γ�����:");
		String subjectName=scan.next();
		System.out.println("������ѧ��1�ı��");
		String id1=scan.next();
		System.out.println("������ѧ��1������:");
		String name1=scan.next();
		System.out.println("������ѧ��2�ı��");
		String id2=scan.next();
		System.out.println("������ѧ��2������:");
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
