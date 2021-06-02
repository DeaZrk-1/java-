package week12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Dao {
	public ArrayList<Student> inputStudent()
	{
		ArrayList<Student> listStudent=new ArrayList<Student>();
		Scanner scan=new Scanner(System.in);
		String aLine="";
		while(!(aLine=scan.nextLine()).equals("end"))
		{
			String arr[]=aLine.split(",|£¬");
			String id=arr[0];
			String name=arr[1];
			String gender=arr[2];
			Student stu=new Student(id,name,gender);
			listStudent.add(stu);
		}
		
		return listStudent;
	}
	public ArrayList<Student> importStudentFromTxt()
	{
		ArrayList<Student> listStudent=new ArrayList<Student>();
		try
		{
			File file=new File("d:/student.txt");
			FileReader fr=new FileReader(file);
			BufferedReader bf=new BufferedReader(fr);
			String aLine="";
			while(!(aLine=bf.readLine()).equals("end"))
			{
				String arr[]=aLine.split(",|£¬");
				String id=arr[0];
				String name=arr[1];
				String gender=arr[2];
				Student stu=new Student(id,name,gender);
				listStudent.add(stu);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return listStudent;
	}
	public ArrayList<Course> inputCourse()
	{
		return null;
	}
	public ArrayList<Course> importCourseFromTxt()
	{
		return null;
	}

}
