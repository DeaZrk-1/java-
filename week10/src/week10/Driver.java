package week10;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao dao=new StudentDao();
		ArrayList<Student> stu=dao.input();
		ArrayList<Result> result=dao.countProvince(stu);
		dao.display(stu,result);
	}

}
