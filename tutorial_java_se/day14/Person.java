package day14;
//编写一个Person类，包括属性（name、age），有参构造器、方法say(返回自我介绍的字符串）。 
//编写一个Student类，继承Person类，增加sno、score属性，以及有参构造器，在子类中调用父类的构造器。编写一个方法showInfo(返回自我介绍的字符串）。
public class Person {
	private static int age;
	private static String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public static int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String Say() {
		return "peron age is: "+getAge()+", name is: "+getName();
	}	
}
