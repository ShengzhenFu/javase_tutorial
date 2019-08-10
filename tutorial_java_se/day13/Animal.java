package day13;

public class Animal {
	String name;
	int age;
	String type;
	public Animal(String name) {
		this.name=name;
	}
	public Animal(String name, int age) {
		this(name);
		this.age=age;
	}
	public Animal(String name, int age, String type) {
		this(name, age);
		this.type=type;
	}
	public static void main(String[] args) {
		Animal a1 = new Animal("dog", 2, "farm dog");
		System.out.println(a1.name+" , "+a1.age+" , "+a1.type);
	}
}
