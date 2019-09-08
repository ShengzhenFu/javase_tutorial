package day13;

public class src {
	public static double getArea(Triangle t) {
		return t.getHeight() * t.getBase() / 2 ;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Tom", 19, 82323);
		System.out.println(p1.getName()+", "+p1.getAge()+", "+p1.getSno());
		day13.Person p2 = new Person("Jerry", 133, 32421);
		System.out.println(p2.getName()+", "+p2.getAge()+", "+p2.getSno());
		
		Triangle t = new Triangle(3.0, 4.0);
		System.out.println("the area of triangle (3, 4) is "+getArea(t));

	}
}
