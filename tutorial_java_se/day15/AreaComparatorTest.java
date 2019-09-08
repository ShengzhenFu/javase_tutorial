package day15;

public class AreaComparatorTest {
	public static void main(String[] args) {
		Areable a1 = new Circle(2.5);
		Areable a2 = new Rectangle(2.0, 3.0);
		int result = new AreaComparator().compare(a1, a2);
		System.out.println(result);
	}
}
