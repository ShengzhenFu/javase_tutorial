package day27;
/*
 * 递归
方法递归调用就是方法自己调用自己 递归必须要有一个出口。 斐波那契数列:1、1、2、3、5、8、13、21、34、
...... 公式:F(1)=1,F(2)=1, F(n)=F(n-1)+F(n-2) 计算斐波那契数列第n项的值
 * */
public class day2705 {
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
		System.out.println(f(10));
	}
}
