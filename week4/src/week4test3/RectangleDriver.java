package week4test3;

public class RectangleDriver {
	public static void main(String[] args) {
		Rectangle rec1=new Rectangle();
		Rectangle rec2=new Rectangle(1.5f, 2.5f);
		rec1.display();
		System.out.println("����1���:"+rec1.area());
		System.out.println("����1�ܳ�:"+rec1.perimeter());
		rec2.display();
		System.out.println("����2���:"+rec2.area());
		System.out.println("����2�ܳ�:"+rec2.perimeter());
	}
	
}
