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
		System.out.println("��������Ǯ����");
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

		System.out.println("2��ԪӲ������"+twoDollar);
		System.out.println("1��ԪӲ������:"+oneDollar);
		System.out.println("50����Ӳ������:"+fiftyCents);
		System.out.println("20����Ӳ������"+twentyCents);
		System.out.println("10����Ӳ������"+tenCents);
		System.out.println("5����Ӳ������"+fiveCents);

	}

}
