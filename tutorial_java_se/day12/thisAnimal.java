package day12;

class Animal_new{
	String name;
	int age;
	// aName, aAge is explicit param
	// 'this' represent current object
	public Animal_new(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this); // address of object
	}
	public void say() {
		 System.out.println("my name is: "+name);
		 System.out.println("my age is: " + age);
	}
}
public class thisAnimal {
	public static void main(String[] args) {
		Animal_new a1 = new Animal_new("cat", 1);
		a1.say();
		
		Animal_new a2 = new Animal_new("dog", 3);
		a2.say();
	}
}
