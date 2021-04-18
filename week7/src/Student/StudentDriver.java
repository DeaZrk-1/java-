package Student;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student("1001","张三");
		Student stu2=new Student("1002","李四");
		Student stu3=new Student("1003","王五");
		Student stu4=new Student("1004","小明");
		
		StudentList list1=new StudentList(10);
		
		list1.add(stu1);
		list1.add(stu2);
		list1.add(stu3);
		list1.add(stu4);
		System.out.println(list1.toString());
		System.out.println(list1.get(2).toString());
		System.out.println(list1.size());
		System.out.println(list1.indexof("1002"));
		list1.remove(2);
		System.out.println(list1.toString());
		System.out.println(list1.size());
		
		
	}

}
