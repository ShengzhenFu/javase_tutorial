package day07;

public class homework_for_loop {
	public static void main(String[] args) {
//		1，使用for循环求1-100的和。
//		2，使用for循环打印1-100的偶数。
//		3，使用嵌套的for循环打印99乘法表。
		int i;
		int sum = 1;
		for (i = 1; i <= 100; i++) {
			sum = sum + i;
		}System.out.println("1-100的和是 "+sum);	
		System.out.print("1-100的偶数是 ");
		int m = 1;
		for (m = 1; m <= 100; m++) {
			if (m % 2 == 0 ) {
				System.out.print(m+",");
				if (m % 20 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("99乘法表: ");
		int p, q;
		for (p = 1; p < 10; p++) {
			for (q = 1; q < 10; q++) {
				System.out.print(p+"x"+q+"="+p*q+" ");
				if (q == 9) {
					System.out.println();
				}
			}
		}
	}
}
