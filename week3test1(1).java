package test;

import java.util.Scanner;

public class week3test1 {
	public static double score[] = null;

	public static void main(String[] args) {
		double average, high, low;
		int choose = menu();
		while (choose != 6) {
			switch (choose) {
			case 1:
				input();
				break;
			case 2:
				if (score == null) {
					System.out.println("请先输入数据");
					break;
				}
				average = getAverage();
				System.out.println("平均分=" + average);
				break;
			case 3:
				if (score == null) {
					System.out.println("请先输入数据");
					break;
				}
				high = high();
				System.out.println("最高分=" + high);
				break;
			case 4:
				if (score == null) {
					System.out.println("请先输入数据");
					break;
				}
				low = low();
				System.out.println("最低分=" + low);
				break;
			case 5:
				if (score == null) {
					System.out.println("请先输入数据");
					break;
				}
				sorting();
				break;
			default:
				System.out.println("输入无效，重新选择");
				break;
			}
			choose = menu();
		}
		System.out.println("程序退出");
	}

	public static void input() {
		score = new double[5];
		boolean ok = false;
		for (int i = 0; i < score.length; i++) {
			ok=false;
			System.out.println("请输入第" + (i + 1) + "个数");
			Scanner scan = new Scanner(System.in);
			while (!ok) {
				score[i] = scan.nextDouble();
				if(score[i]<0||score[i]>100)
				{
					ok=false;
					System.out.println("请重新输入");
				}
				else
					ok=true;
			}
		}
	}

	public static int menu() {
		int choice = 0;
		System.out.println("=====WTU BANK=====");
		System.out.println("1.input");
		System.out.println("2.class Average");
		System.out.println("3.Highest Grade");
		System.out.println("4.Lowest Grade");
		System.out.println("5.sorting");
		System.out.println("6.exit");
		System.out.println("please choose(1-6)");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static double getAverage() {
		double average = 0;
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		average = sum / (score.length);
		return average;
	}

	public static double high() {
		double high = score[0];
		for (int i = 1; i < score.length; i++) {
			if (high < score[i])
				high = score[i];
		}
		return high;
	}

	public static double low() {
		double low = score[0];
		for (int i = 1; i < score.length; i++) {
			if (low > score[i])
				low = score[i];
		}
		return low;
	}
	public static void sorting(){
		int i,j;
		double temp;
		for(i=0;i<score.length-1;i++){
			for(j=0;j<score.length-i-1;j++)
			{
				if(score[j]<score[j+1])
				{
					temp=score[j];
					score[j]=score[j+1];
					score[j+1]=temp;
				}
			}
		}
		for(i=0;i<score.length;i++)
			System.out.print(score[i]+" ");
	}

}