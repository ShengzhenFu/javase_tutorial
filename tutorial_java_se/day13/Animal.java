package day13;

import day12.thisAnimal;

public class Animal {
	static String name;
	static int age;
	static String type;
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
	System.out.println(a1.name+" , is age "+a1.age+" , is a "+a1.type);
	}
}
