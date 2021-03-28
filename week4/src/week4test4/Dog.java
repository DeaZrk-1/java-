package week4test4;

public class Dog {
	private String name;
	private String color;
	private int age;
	
	
	public Dog(String name,String color,int age){
		this.name=name;
		this.color=color;
		this.age=age;
	}

	public void displayDog(){
		String dog;
		dog="name:"+this.name;
		dog+="color:"+this.color;
		dog+="age:"+this.age;
		System.out.println(dog);
	}

}