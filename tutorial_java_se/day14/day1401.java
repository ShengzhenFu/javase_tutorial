package day14;

public class day1401 {
	public static void main(String[] args) {
		Shirt s = new Shirt(100);
		System.out.println(s.size);
		System.out.println(s.calcArea());

		Coat c = new Coat(100);
		System.out.println(c.calcArea());
	}
}
