package week5test1;

import java.util.Scanner;

public class test1 {
	
	public static void main(String[] args) {
		String date,year,month,day;
		int pos1,pos2;
		Scanner scan=new Scanner(System.in);
		date=scan.next();
		pos1=date.indexOf(".");
		pos2=date.indexOf(".",pos1+1);
		year=date.substring(0,4);
		System.out.println(year);
		month=date.substring(pos1+1,pos2);
		day=date.substring(pos2+1);
		System.out.println(month);
		System.out.println(day);
	}

}
