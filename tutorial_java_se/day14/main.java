package day14;

public class main {	
	public static void main(String[] args) {
		Person p = new Person(36, "Tom");
		System.out.println(p.Say());
		
		Student s = new Student(10, "Jerry", 10001, 85);
		System.out.println(s.showInfo());
	}
}
