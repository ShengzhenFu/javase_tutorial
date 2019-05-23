package day12;

public class test_Person {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Leonard";
		p1.gender = 'm';
		p1.age = 28;
		p1.showInfo();
		
		Person.count = 0;
		
	}
}
