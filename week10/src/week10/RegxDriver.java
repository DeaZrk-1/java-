package week10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxDriver {
	public static void main(String[] args) {
		/*
		//String regxMobile="1[3578]\\d(9)";
		//String regxMobile="(0\\d(2,3)-?)?[1-9]\\d(6,7)";
		String regxMobile="\\w+@\\w+(.\\w+)+";
		Scanner scan=new Scanner(System.in);
		String phone=scan.nextLine();
		Pattern p=Pattern.compile(regxMobile);
		Matcher m=p.matcher(phone);
		if(m.matches())
		{
			System.out.println("输入合法");
		}
		else{
			System.out.println("不合法,请重新输入直到正确为止.");
		}
		*/
		String reg="";
		Scanner scan=new Scanner(System.in);
		String  expression=scan.nextLine();
		while(!reg.matches(reg))
		{
			System.out.println("不合法,请重新输入直到正确为止.");
			expression=scan.nextLine();
		}
		System.out.println("输入合法");
	}

}
