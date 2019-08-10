package day13;

public class Teacher {
	String name;
	int age;
	
	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this);
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Sara", 26);
		System.out.println(t1);
		t1.setName("Anna");
		t1.setAge(23);
		System.out.println(t1.name+" "+t1.age);
		System.out.println(t1);
	}
}
