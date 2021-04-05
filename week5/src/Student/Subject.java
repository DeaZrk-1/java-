package Student;

public class Subject {
	private String id;
	private String name;
	public Subject(String id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		String info="";
		info="¿Î³Ìid:"+this.id+"\t"+"¿Î³ÌÃû×Ö:"+this.name;
		return info;
	}
	

}
