package week4teast2;

public class Student {
	private String name;
	private int phoneNum;
	private int studentNum;
	
	public Student(){
		this.name="ÕÅÈı";
		this.phoneNum=123456789;
		this.studentNum=1001;
	}
	
	public Student(String name,int phoneNum,int studentNum){
		this.name=name;
		this.phoneNum=phoneNum;
		this.studentNum=studentNum;
	}
	public String getname(){
		return name;
	}
	public void setname(){
		this.name=name;
	}
	public void displayStudent(){
		String stu;
		stu="name:"+this.name;
		stu+="phoneNum:"+this.phoneNum;
		stu+="studentNum:"+this.studentNum;
		System.out.println(stu);
	}

}
