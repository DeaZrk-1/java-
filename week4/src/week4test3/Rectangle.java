package week4test3;

public class Rectangle {
	private float width;
	private float length;
	
	public Rectangle(){
		this.length=1.0f;
		this.width=1.0f;
	}
	public Rectangle(float width,float length){
		this.width=width;
		this.length=length;
		
	}
	public void display(){
		System.out.println("width:"+this.width);
		System.out.println("length:"+this.length);
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float area(){
		float area;
		area=width*length;
		return area;
	}
	public float perimeter(){
		float perimeter;
		perimeter=2*(width+length);
		return perimeter;
	}

}
