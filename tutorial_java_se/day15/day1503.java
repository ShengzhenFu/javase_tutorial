package day15;

public class day1503 {
	public static void main(String[] args) {
		Client c1 = new Client(25);
		Client c2 = new Client(25);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
	}
}
