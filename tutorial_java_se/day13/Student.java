package day13;

public class Student {
	String name;
	int age;
	
	public Student() {
		System.out.println("constructor of student");
	}
	
	public Student(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Tom", 16);
		System.out.println(s1);
		System.out.println("student name: "+s2.name+"\nStudent age : "+s2.age);	
	}
}


