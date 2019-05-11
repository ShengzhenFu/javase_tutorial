package day05;

public class ThreeElementOperation {
	public static void main(String[] args) {
		int age = 16;
		System.out.println(age >= 16 ? "adult":"adolescent");
		
		age = 15;
		System.out.println(age >= 16 ? "adult":"adolescent");
		
		String str = age >= 18 ? "adult":"adolescent";
		System.out.println(str);
		
	}

}
