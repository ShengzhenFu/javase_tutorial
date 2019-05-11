package day2;

public class numbers {
	public static void main(String[] args) {
		/*
		 * +add+ -minus- *multiply* /divide/ calculation 
		 * */
		int a = 5;
		int b = 2;
		int c = -2;
		a += 5;  //a=5, 5 + 5 = 10, a has a new value of 10
		System.out.println(a);  // 10
		a *= 10; // a=10, 10 * 10 =100, a has a new value of 100
		System.out.println(a);  // 100
		a /= 5; // a = 100, 100 / 5 = 20, a has new value of 20
		System.out.println(a); // 20
		
		System.out.println(b); // 2
		System.out.println(b+2); // 2 + 2 =4 , b has a new value of 4
		System.out.println(c);  // -2
		System.out.println(c+2); // -2 + 2 =0, c has a new value of 0
		/*
		 * mod calculation
		 * */
		System.out.println(10 % 4);  // 10 mod 4 = 2
		System.out.println(15 % 4);  // 15 mod 4 = 3
		System.out.println(16 % 4);  // 16 mod 4 = 0
		/*
		 * increamental & decreamental numbers
		 * */
		System.out.println("increamental & decreamental numbers");
		int x =3;
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);
		++x;
		System.out.println(x);
		--x;
		System.out.println(x);
		
		int y = 5;
		int z = ++y; //y increased, then add to z, so z value is 6
		System.out.println(y);  // 6
		System.out.println(z);  // 6
		
		int h = 3;
		int j = h++; // h value give to j, then h increased
		System.out.println(h); // 4
		System.out.println(j); // 3
	}
}
