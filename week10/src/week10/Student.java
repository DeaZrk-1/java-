package week10;

public class Student {
	private String id;
	private String name;
	private String gender;
	private String province;
	public Student(String id, String name, String gender, String province) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.province = province;
	}
	public Student() {
		super();
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
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	@Override
	public String toString() {
		return id+ ", " + name + "," + gender + "," + province ;
	}
	

}
