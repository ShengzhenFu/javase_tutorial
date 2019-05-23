package day12;

public class Animal {
	String name;
	// constructor, compiler will create by itself if not exists
	// constructor used to initialize variables
	public Animal() {
//		System.out.println("animal() is called");
		name = "Animal";
	}
	// constructor can be re-constructed
	public Animal(String m) {
		name = m;
	}
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal("tiger");
		System.out.println(a1.name);
		System.out.println(a2.name);
	}
}
