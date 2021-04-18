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
		System.out.println("===ѡ��ϵͳ===");
		System.out.println("1.�����γ�");
		System.out.println("2.ѡ��");
		System.out.println("3.��ѡ");
		System.out.println("4.��ӡ����");
		System.out.println("5.�˳�");
		System.out.println("������ѡ��");
		choice=scan.nextInt();
		if(choice!=1 && list1==null)
		{
			System.out.println("���ȴ����γ�,���Զ�ѡ��Ϊ1");
			choice=1;
		}
		if(choice==2 && list1.length()==list1.size())
		{
			System.out.println("�Ѵ����ѡ������");
			choice=menu();
		}
		return choice;
	}
	public static void creatSubject(){
		String i;
		if(list1!=null)
		{
			System.out.println("�γ��Ѿ����ڣ��Ƿ����´���(y/n)");
			i=scan.next();
			if(i.equals("n"))
				return ;
		}
		String subjectId,subjectName;
		int number;
		System.out.println("������γ�id:");
		subjectId=scan.next();
		System.out.println("������γ�����:");
		subjectName=scan.next();
		System.out.println("������γ�����:");
		number=scan.nextInt();
		sub=new Subject(subjectId,subjectName,number);
		System.out.println(sub.toString());
		list1=new SubjectEnrolment(sub);
	}
	public static void select(){
		String id,name;
		System.out.println("������ѧ��id:");
		id=scan.next();
		System.out.println("������ѧ������:");
		name=scan.next();
		stu=new Stu(id,name);
		list1.add(stu);
		System.out.println("ѡ�γɹ�");
		display();
	}
	public static void remove() {
		String id;
		System.out.println("������ѧ����id");
		id=scan.next();
		if(list1.indexof(id)==-1)
		{
			 System.out.println("ѧ��Ϊ"+id+"��ѧ��û��ѡ��");
			 return ;
		}
		list1.remove(list1.indexof(id));
		System.out.println("��ѡ�ɹ���Ŀǰ��ѡ����Ϣ����");
		display();
	}
	public static void display() {
		System.out.println("Ŀǰ��ѡ����Ϣ����:");
		System.out.println(sub.toString());
		System.out.println(list1.toString());
	}
}
