package Student;

public class ClassList {
	private int semester;
	private int year;
	private Subject sub;
	private Student s1;
	private Student s2;
	
	public ClassList(int semester, int year, Subject sub, Student s1, Student s2) {
		super();
		this.semester = semester;
		this.year = year;
		this.sub = sub;
		this.s1 = s1;
		this.s2 = s2;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		String info="";
		info="学期:"+this.semester+"\t"+"学年:"+this.year+"\n";
		info=info+this.s1.toString()+"\n";
		info=info+this.s2.toString()+"\n";
		info=info+this.sub.toString();
		return info;
	}

}
