

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
	/*
		Date date=new Date();
		
		System.out.println(date);
		
		Calendar cal=new GregorianCalendar();
		int year =cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month =cal.get(Calendar.MONTH);
		System.out.println(month);
		
		int week=cal.get(Calendar.DAY_OF_WEEK);
		StringBuffer weekStr=new StringBuffer("星期");
		switch(week-1)
		{
		case 0:weekStr =weekStr.append("日");break;
		default:weekStr=weekStr.append(week-1);break;
		}
		System.out.println(weekStr);

		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat df=new SimpleDateFormat("yyyyMMddhhmm");
		
		String today=df.format(date);
		System.out.println(today);
		*/
		/*
		Scanner scan=new Scanner(System.in);
		int i=1,m=1;
		String name[]=null,num1[]=null,price[] = null,price1[]=null;
		NumberFormat nf=NumberFormat.getIntegerInstance();
		nf.setGroupingUsed(false);
		nf.setMaximumIntegerDigits(4);
		nf.setMinimumIntegerDigits(4);
		String num=nf.format(i);
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("yyyyMMdd");
		String today=df.format(date);
		String choose;
		choose=scan.nextLine();
		while(!choose.equals("0000"))
		{
			String[] array=choose.split(",");
			name[i-1]=array[0];
			num1[i-1]=array[1];
			price[i-1]=array[2];
			price1[i-1]=array[3];
			i++;
			m++;
			choose=scan.nextLine();
		}
		System.out.println("流水号           商品名称   商品数量   单价   总价");
		for(i=1;i<m;i++)
		{
			System.out.println(num+"   "+name[i-1]+"  "+num1[i-1]+"  "+price[i-1]+"   "+price1[i-1]);
		}
		*/
	}
		

}
