package week12;

public class Student {
	private String id;
	private String name;
	private String gender;
	private float ave;
	public Student(String id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public Student(String id, String name, String gender, float ave) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.ave = ave;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getAve() {
		return ave;
	}
	public void setAve(float ave) {
		this.ave = ave;
	}
	@Override
	public String toString() {
		return  id + "\t" + name + "\t" + gender + "\t" + ave + "\t";
	}

}
