package week4test3;

public class RectangleDriver {
	public static void main(String[] args) {
		Rectangle rec1=new Rectangle();
		Rectangle rec2=new Rectangle(1.5f, 2.5f);
		rec1.display();
		System.out.println("矩形1面积:"+rec1.area());
		System.out.println("矩形1周长:"+rec1.perimeter());
		rec2.display();
		System.out.println("矩形2面积:"+rec2.area());
		System.out.println("矩形2周长:"+rec2.perimeter());
	}
	
}
