package test1;

import java.util.Scanner;

public class test1 {
	public static void main(String args[]) {
		float totalAmount;
		int fiftyCents;
		int twentyCents;
		int tenCents;
		int fiveCents;
		int twoDollar;
		int oneDollar;
			
		
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入总钱数。");
		totalAmount=scan.nextFloat();
		
		twoDollar=(int)(totalAmount/2);
		totalAmount=totalAmount-2*twoDollar;
		oneDollar=(int)(totalAmount/1);
		totalAmount=totalAmount-1*oneDollar;
		fiftyCents=(int)(totalAmount/0.5);
		totalAmount=(float)(totalAmount-0.5*fiftyCents);
		twentyCents=(int)(totalAmount/0.2);
		totalAmount=(float)(totalAmount-0.2*twentyCents);
		tenCents=(int)(totalAmount/0.1);
		totalAmount=(float)(totalAmount-0.1*tenCents);
		fiveCents=(int)(totalAmount/0.05);

		System.out.println("2美元硬币数量"+twoDollar);
		System.out.println("1美元硬币数量:"+oneDollar);
		System.out.println("50美分硬币数量:"+fiftyCents);
		System.out.println("20美分硬币数量"+twentyCents);
		System.out.println("10美分硬币数量"+tenCents);
		System.out.println("5美分硬币数量"+fiveCents);

	}

}
