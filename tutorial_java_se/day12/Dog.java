package day12;
//1，定义一个类Dog，它有age，name，color，String type。创建出来三个对象，赋值，并访问。
public class Dog {
	int age;
	String name;
	String color;
	String type;
	public static void main(String[] args) {
		Dog dog_a = new Dog();
		Dog dog_b = new Dog();
		Dog dog_c = new Dog();
		dog_a.age = 1;				dog_b.age = 2;				dog_c.age = 3;			
		dog_a.name = "dog A";		dog_b.name = "dog B";		dog_c.name = "dog C";
		dog_a.color = "black";		dog_b.color = "White";		dog_c.color = "Yellow";
		dog_a.type = "Ha Shi Qi";   dog_b.type = "Sa mo Ye";    dog_c.type = "China farm dog";
		System.out.println("dog1:"+dog_a.age+" year, name is "+dog_a.name+", color is "+dog_a.color+", type is"+dog_a.type);
		System.out.println("dog2:"+dog_b.age+" year, name is "+dog_b.name+", color is "+dog_b.color+", type is"+dog_b.type);
		System.out.println("dog3:"+dog_c.age+" year, name is "+dog_c.name+", color is "+dog_c.color+", type is"+dog_c.type);
	}
}
