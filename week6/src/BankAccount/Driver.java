package BankAccount;

import java.util.Scanner;

public class Driver {
	public static Customer customer=null;
	public static CheckingAccount checkingAccount=null;
	public static SavingsAccount savingsAccount=null;
	Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		choice=menu();
		while(choice!=8)
		{
			switch(choice)
			{
			case 1:creat();break;
			case 2:save();break;
			case 3:withdraw();break;
			case 4:consume();break;
			case 5:repay();break;
			case 6:settle();break;
			case 7:balance();break;
			}
			choice=menu();
		}

	}
	public static int menu(){
		Scanner scan=new Scanner(System.in);
		System.out.println("===��ӭʹ������ϵͳ===");
		System.out.println("1.����");
		System.out.println("2.���");
		System.out.println("3.ȡ��");
		System.out.println("4.����");
		System.out.println("5.����");
		System.out.println("6.���н���");
		System.out.println("7.��ѯ���");
		System.out.println("8���˳�");
		int choice=scan.nextInt();
		if(choice==8)
		{
			System.out.println("��ӭ�´�ʹ��");
			return choice;
		}
		while(choice!=1&&customer==null)
		{
			System.out.println("������ɿ���, ����������ѡ��");
			choice=scan.nextInt();
		}
		while(choice>8)
		{
			System.out.println("��������Ч�ı��,����������");
			choice=scan.nextInt();
		}
		if(customer==null)
			customer=new Customer();
		return choice;
	}
	public static int stmenu(){
		Scanner scan=new Scanner(System.in);
		int choice;
		System.out.println("��ѡ�񿪿�����");
		System.out.println("1.���ÿ�");
		System.out.println("2.�洢��");
		System.out.println("3.����");
		choice=scan.nextInt();
		while(choice>3&&choice<1) {
			System.out.println("��������Ч�ı��,����������");
			choice=scan.nextInt();
		}
		return choice;
		
	}_
	public static void creat(){
		int choice=stmenu();
		while(choice!=3)
		{
			switch(choice)
			{
			case 1:setCheckingAccout();break;
			case 2:setSavingsAccount();break;
			}
			choice=stmenu();
		}
	}
	public static void setCheckingAccout() {
		Scanner scan=new Scanner(System.in)
		String ssn,name,accountNum;
		double serviceNum;
		System.out.println("�������� ssn��name�����ţ������");
		ssn=scan.next();
		name=scan.next();
		accountNum=scan.next();
		serviceNum=scan.nextDouble();
		checkingAccount =new CheckingAccount(accountNum,0,serviceNum);
		customer.setSsn(ssn);
		customer.setName(name);
		customer.setCheckingAccount(checkingAccount);
		System.out.println("�ÿ���ϢΪ");
		System.out.println(customer.toString());
		
	}
	public static void setSavingsAccount() {
		Scanner scan=new Scanner(System.in);
		String ssn,name,accountNum;
		double interestRate;
		System.out.println("�������� ssn��name�����ţ�����");
		ssn=scan.next();
		name=scan.next();
		accountNum=scan.next();
		interestRate=scan.nextDouble();
		savingsAccount =new SavingsAccount(accountNum,0,interestRate);
		customer.setSsn(ssn);
		customer.setName(name);
		customer.setSavingAccount(savingsAccount);
		System.out.println("�ÿ���ϢΪ");
		System.out.println(customer.toString());
	}
	public static void save(){
		Scanner scan=new Scanner(System.in);
		double money;
		System.out.println("����洢����");
		money=scan.nextDouble();
		if(savingsAccount==null)
		{
			System.out.println("��Ϊ��ͨ���");
			return ;
		}
		savingsAccount.setBalance(savingsAccount.getBalance()+money);
		customer.setSavingAccount(savingsAccount);
		System.out.println("���ɹ�");
		
		
	}
	public static void withdraw(){
		Scanner scan=new Scanner(System.in);
		double money;
		System.out.println("����ȡ������");
		money=scan.nextDouble();
		if(savingsAccount==null)
		{
			System.out.println("��Ϊ��ͨ���");
			return ;
		}
		while(money>savingsAccount.getBalance()){
			System.out.println("�����˻�����");
			money=scan.nextDouble();
		}
		savingsAccount.setBalance(savingsAccount.getBalance()-money);
		customer.setSavingAccount(savingsAccount);
	}
	public static void consume() {
		Scanner scan=new Scanner(System.in);
		double money;
		System.out.println("����������");
		money=scan.nextDouble();
		if(checkingAccount==null)
		{
			System.out.println("��Ϊ��ͨ���ÿ�");
			return ;
		}
		checkingAccount.setBalance(checkingAccount.getBalance()+money);
		customer.setCheckingAccount(checkingAccount);
		System.out.println("���ɹ�");
		
	}
	public static void repay() {
		Scanner scan=new Scanner(System.in);
		double money;
		System.out.println("���뻹������");
		money=scan.nextDouble();
		if(checkingAccount==null)
		{
			System.out.println("��Ϊ��ͨ���ÿ�");
			return ;
		}
		while(money>checkingAccount.getBalance()){
			System.out.println("���������ڽ����");
			money=scan.nextDouble();
		}
		checkingAccount.setBalance(checkingAccount.getBalance()-money);
		customer.setCheckingAccount(checkingAccount);
		System.out.println("����ɹ�");
	}
	public static void settle() {
		if(checkingAccount!=null) {
			checkingAccount.assesServiceCharge();
		}
		if(savingsAccount!=null) {
			savingsAccount.interset();
		}
		System.out.println("����ɹ�");
		System.out.println();
	}
	public static void balance()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("������Ҫ��ѯ�Ŀ� 1.��� 2.���ÿ�");
		int choice=scan.nextInt();
		if(choice==1)
		{
			if(savingsAccount==null)
			{
				System.out.println("��Ϊ��ͨ���");
				return ;
			}
			System.out.println(savingsAccount.getBalance());
		}
		if(choice==2)
		{
			if(checkingAccount==null)
			{
				System.out.println("��Ϊ��ͨ���ÿ�");
				return ;
			}
			System.out.println(checkingAccount.getBalance());
		}
	}
}

