package day12;

public class Person {
	String name; // non static variable can be used by object 
	char gender;
	int age;
	
	static int count; // static variable can be used by class
	
	public void showInfo() {
		System.out.println("name is "+ name);
		System.out.println("gender is "+ gender);
		System.out.println("age is "+ age);
	}
}
