package test;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class week3test2 {
	public static int score[] = null;
	public static int firstNum, secondNum;
	public static boolean ok = false;

	public static void main(String[] args) {
		int average, firstNum, secondNum;
		int choose = menu();
		while (choose != 7) {
			switch (choose) {
			case 1:
				input();
				break;
			case 2:
				if (!ok) {
					System.out.println("������������");
					break;
				}
				oddNum();

				break;
			case 3:
				if (!ok) {
					System.out.println("������������");
					break;
				}
				evenNumSum();
				break;
			case 4:
				square();
				break;
			case 5:
				if (!ok) {
					System.out.println("������������");
					break;
				}
				Sum();
				break;
			case 6:
				letters();
				break;
			default:
				System.out.println("������Ч������ѡ��");
				break;
			}
			choose = menu();
		}
		System.out.println("�����˳�");
	}

	public static void input() {
		Scanner scan = new Scanner(System.in);
		while (!ok) {
			System.out.println("�������һ����");
			firstNum = scan.nextInt();
			System.out.println("������ڶ�����");
			secondNum = scan.nextInt();
			if (firstNum < secondNum)
				ok = true;
			else {
				ok = false;
				System.out.println("�����������������");
			}
		}
	}

	public static int menu() {
		int choice = 0;
		System.out.println("=====WTU BANK=====");
		System.out.println("1.input");
		System.out.println("2.allOddNum");
		System.out.println("3.evenNumSum");
		System.out.println("4.out put num squares between 1-10");
		System.out.println("5.sum of the squares of odd numbers between firstNum and secondNum");
		System.out.println("6.uppercase letters");
		System.out.println("7.exit");
		System.out.println("please choos(1-7)");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static void oddNum() {
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 == 1)
				System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void evenNumSum() {
		int sum = 0;
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println("even num sum=" + sum);
	}

	public static void square()
	{
		for (int i = 1; i <= 10; i++) {
			System.out.println("�����Ϊ"+i+"ƽ��Ϊ"+i*i);
		}
	}
	public static void Sum(){
		int sum=0;
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 == 1)
				sum+=i*i;
		}
		System.out.println("��������ƽ����Ϊ"+sum);
	}
	public static void letters(){
		
	}

}