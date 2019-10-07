package day27;
//使用递归计算斐波那契数列前n项的和。
public class homework2701 {
	public static int f(int n) {
		int result = 0;
		if (n == 1 || n == 2) {
			result = 1;
		} else {
			result = f(n - 1) + f(n - 2);
		}
		return result;
	}

	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			result += f(i);
		}
		System.out.println(result);
	}
}
