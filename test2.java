package test1;

import java.util.Scanner;

public class test2 {
	public static void main(String args[]) {
		int length;
		int wide;
		int type;
		int crowns;
		String color;
		float cost;
		float cardboardCost;
		float glassCost;
		float totalCost;
		
		float area;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入画框长度:");
		length=scan.nextInt();
		System.out.println("请输入画框宽度:");
		wide=scan.nextInt();
		System.out.println("请输入画框的样式，普通款输入1，高级款输入2:");
		type=scan.nextInt();
		System.out.println("请输入画框颜色:");
		color=scan.next();
		System.out.println("请输入皇冠数量:");
		crowns=scan.nextInt();
		
		area=(float)(length*wide);
		cardboardCost=0.02f;
		glassCost=0.07f;
		if(type==1)
		{
			cost=2*(wide+length)*0.25f;
			cost=cost+area*(cardboardCost+glassCost);
			totalCost=cost+0.35f*crowns;
			System.out.println("总成本为:"+totalCost);
		}
		else
		{
			if(type==2)
			{
				cost=2*(wide+length)*0.35f;
				cost=cost+area*(cardboardCost+glassCost);
				totalCost=cost+0.35f*crowns;
				System.out.println("总成本为:"+totalCost);
			}
			else
				System.out.println("error");
		}
	}

}
