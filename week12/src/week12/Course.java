package week12;

public class Course {
	private String id;
	private String course;
	private float score;
	public Course(String id, String course, float score) {
		super();
		this.id = id;
		this.course = course;
		this.score = score;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return id + "\t" + course + "\t" + score + "\t";
	}

}
