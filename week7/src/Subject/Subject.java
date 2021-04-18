package Subject;

public class Subject {
	private String id;
	private String name;
	private int number;
	public Subject(String id, String name, int number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	

}
