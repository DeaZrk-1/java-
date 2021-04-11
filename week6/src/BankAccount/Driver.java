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
		System.out.println("===欢迎使用银行系统===");
		System.out.println("1.开户");
		System.out.println("2.存款");
		System.out.println("3.取款");
		System.out.println("4.消费");
		System.out.println("5.还款");
		System.out.println("6.银行结算");
		System.out.println("7.查询余额");
		System.out.println("8。退出");
		int choice=scan.nextInt();
		if(choice==8)
		{
			System.out.println("欢迎下次使用");
			return choice;
		}
		while(choice!=1&&customer==null)
		{
			System.out.println("请先完成开户, 请重新输入选择");
			choice=scan.nextInt();
		}
		while(choice>8)
		{
			System.out.println("请输入有效的编号,请重新输入");
			choice=scan.nextInt();
		}
		if(customer==null)
			customer=new Customer();
		return choice;
	}
	public static int stmenu(){
		Scanner scan=new Scanner(System.in);
		int choice;
		System.out.println("请选择开卡类型");
		System.out.println("1.信用卡");
		System.out.println("2.存储卡");
		System.out.println("3.返回");
		choice=scan.nextInt();
		while(choice>3&&choice<1) {
			System.out.println("请输入有效的编号,请重新输入");
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
		System.out.println("依次输入 ssn，name，卡号，服务费");
		ssn=scan.next();
		name=scan.next();
		accountNum=scan.next();
		serviceNum=scan.nextDouble();
		checkingAccount =new CheckingAccount(accountNum,0,serviceNum);
		customer.setSsn(ssn);
		customer.setName(name);
		customer.setCheckingAccount(checkingAccount);
		System.out.println("该卡信息为");
		System.out.println(customer.toString());
		
	}
	public static void setSavingsAccount() {
		Scanner scan=new Scanner(System.in);
		String ssn,name,accountNum;
		double interestRate;
		System.out.println("依次输入 ssn，name，卡号，利率");
		ssn=scan.next();
		name=scan.next();
		accountNum=scan.next();
		interestRate=scan.nextDouble();
		savingsAccount =new SavingsAccount(accountNum,0,interestRate);
		customer.setSsn(ssn);
		customer.setName(name);
		customer.setSavingAccount(savingsAccount);
		System.out.println("该卡信息为");
		System.out.println(customer.toString());
	}
	public static void save(){
		Scanner scan=new Scanner(System.in);
		double money;
		System.out.println("输入存储数额");
		money=scan.nextDouble();
		if(savingsAccount==null)
		{
			System.out.println("您为开通储蓄卡");
			return ;
		}
		savingsAccount.setBalance(savingsAccount.getBalance()+money);
		customer.setSavingAccount(savingsAccount);
		System.out.println("存款成功");
		
		
	}
	public static void withdraw(){
		Scanner scan=new Scanner(System.in);
		double money;
		System.out.println("输入取款数额");
		money=scan.nextDouble();
		if(savingsAccount==null)
		{
			System.out.println("您为开通储蓄卡");
			return ;
		}
		while(money>savingsAccount.getBalance()){
			System.out.println("您的账户余额不足");
			money=scan.nextDouble();
		}
		savingsAccount.setBalance(savingsAccount.getBalance()-money);
		customer.setSavingAccount(savingsAccount);
	}
	public static void consume() {
		Scanner scan=new Scanner(System.in);
		double money;
		System.out.println("输入借款数额");
		money=scan.nextDouble();
		if(checkingAccount==null)
		{
			System.out.println("您为开通信用卡");
			return ;
		}
		checkingAccount.setBalance(checkingAccount.getBalance()+money);
		customer.setCheckingAccount(checkingAccount);
		System.out.println("借款成功");
		
	}
	public static void repay() {
		Scanner scan=new Scanner(System.in);
		double money;
		System.out.println("输入还款数额");
		money=scan.nextDouble();
		if(checkingAccount==null)
		{
			System.out.println("您为开通信用卡");
			return ;
		}
		while(money>checkingAccount.getBalance()){
			System.out.println("还款数大于借款数");
			money=scan.nextDouble();
		}
		checkingAccount.setBalance(checkingAccount.getBalance()-money);
		customer.setCheckingAccount(checkingAccount);
		System.out.println("还款成功");
	}
	public static void settle() {
		if(checkingAccount!=null) {
			checkingAccount.assesServiceCharge();
		}
		if(savingsAccount!=null) {
			savingsAccount.interset();
		}
		System.out.println("结算成功");
		System.out.println();
	}
	public static void balance()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("输入您要查询的卡 1.储蓄卡 2.信用卡");
		int choice=scan.nextInt();
		if(choice==1)
		{
			if(savingsAccount==null)
			{
				System.out.println("您为开通储蓄卡");
				return ;
			}
			System.out.println(savingsAccount.getBalance());
		}
		if(choice==2)
		{
			if(checkingAccount==null)
			{
				System.out.println("您为开通信用卡");
				return ;
			}
			System.out.println(checkingAccount.getBalance());
		}
	}
}

