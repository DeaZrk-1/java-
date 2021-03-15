package test2;

import java.util.Scanner;

public class week2test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number=0;
		int n;
		int i;
		int sum=0;
		int w1;
		int w2;
		System.out.println("Enter n");
		n=scanner.nextInt();
		for(i=(int)(Math.pow(10,n-1));i<=Math.pow(10, n);i++)
		{
			w1=i;
			for(int j=n;j>0;j--)
			{
				w2=w1%10;
				number=number+(int)(Math.pow(w2, n));
				w1=w1/10;
			}
			if(number==i)
				System.out.println(number);
			number=0;
		}
	}
}