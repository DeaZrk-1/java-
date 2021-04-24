package week8;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		/*System.out.println("输入学生的基本信息,包括学号，姓名，性别，出生日期");
		Scanner scan=new Scanner(System.in);
		
		String data=scan.next();
		String array[]=data.split(",||，");
		String id=array[0];
		String name=array[1];
		String gender=array[2];
		String birth=array[3];
		
		Student stub=new Student(id,name,gender,birth);
		System.out.println(stu.toString());
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入");
		String express=scan.next();
		float number1=0,number2 = 0,result;
		int pos1=express.indexOf('(');
		String operatorCode=express.substring(0,pos1);
		if(operatorCode.equals("doubleMe"))
		{
			int pos2=express.indexOf(')',pos1+1);
			number1=Float.parseFloat(express.substring(pos1+1,pos2));
		}
		else
		{
			int pos2=express.indexOf(')',pos1+1);
			int pos3=express.indexOf(',',pos1+1);
			number1=Float.parseFloat(express.substring(pos1+1,pos3));
			number2=Float.parseFloat(express.substring(pos3+1,pos2));
		}
		switch(operatorCode)
		{
		case "add":result=number1+number2;System.out.println(express+"="+result);break;
		case "sub":result=number1-number2;System.out.println(express+"="+result);break;
		case "max":result=number1*number2;System.out.println(express+"="+result);break;
		case "min":result=number1/number2;System.out.println(express+"="+result);break;
		case "doubleMe":result=number1*2;System.out.println(express+"="+result);break;
		}
		

	}

}
