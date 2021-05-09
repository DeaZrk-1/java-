package week10;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDao {
	public static ArrayList<Student> input(){
		ArrayList<Student> liststu=new ArrayList<Student>();
		Scanner scan=new Scanner(System.in);
		String date="";
		date=scan.nextLine();
		while(!date.equals("end"))
		{
			String stuArray[]=date.split(",|，");
			Student stu=new Student(stuArray[0],stuArray[1],stuArray[2],stuArray[3]);
			liststu.add(stu);
		}
		return liststu;
	}
	public static int countByGender(ArrayList<Student> liststu,String gender){
		int count=0;
		for (Student student : liststu) {
			String stuGender=student.getGender();
			if(stuGender.equals(gender))
				count++;
		}
		return count;
	}
	public static ArrayList<Result> countProvince(ArrayList<Student> liststu){
		ArrayList<Result> listResult=new ArrayList<Result>();
		for(int i=0;i<liststu.size();i++)
		{
			Student stu=liststu.get(i);
			String province=stu.getProvince();
			String name=stu.getName();
			int index=isProvinceExist(listResult,province);
			if(index!=-1)
			{
				Result oldResult=listResult.get(index);
				oldResult.setCount(oldResult.getCount()+1);
				oldResult.setNames(oldResult.getNames()+","+name);
				listResult.set(index, oldResult);
			}
			else 
			{
				Result result=new Result(province,1,name);
				listResult.add(result);
			}
		}
		
		return listResult;
	}
	public static int isProvinceExist(ArrayList<Result> listResult,String province)
	{
		int index=-1;
		for(int i=0;i<listResult.size();i++)
		{
			Result result=listResult.get(i);
			if(result.getProvince().equals(province))
				return i;
		}
		return index;
	}
	public static void display(ArrayList<Student> listStu,ArrayList<Result> listResult)
	{
		int totalCount=listStu.size();
		int maleCount=countByGender(listStu, "男");
		int femaleCount=countByGender(listStu, "女");
		System.out.println("总人数:"+totalCount);
		System.out.println("其中男:"+maleCount+"人,"+maleCount*100.0f/totalCount+"%,女:"+femaleCount+"人,"+femaleCount*100.0f/totalCount+"%");
		for (Result result : listResult) {
			System.out.println(result.toString());
		}
	}

}
