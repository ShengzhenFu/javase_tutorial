package day07;
//1，定义一个方法，功能是打印m行n列的指定符号的矩形，在主方法中调用此方法。
//2，定义一个方法，功能是计算长为x，宽为y的矩形的面积，在主方法中调用此方法，在主方法中打印结果。
//3，定义一个方法，实现找出三个数的最大值，并在主方法中调用此方法，在主方法中打印结果。
public class homework1 {
	public static void print_rectangle(int m, int n) {
		int i, j;
		for (i =1; i <= m; i++) {
			for (j = 1; j <= n; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
	}	
	public static void calc_area(int length, int width) {
		System.out.println("length is "+length+", width is "+width+", the square is "+length*width);
	}	
	public static void max_num(int a, int b, int c) {
		System.out.println("the max number in "+a+","+b+","+c+ " is " +Math.max(c, Math.max(a, b)));
	}	
	public static void main(String[] args) {
		homework1.print_rectangle(3, 4);
		homework1.calc_area(6, 7);
		homework1.max_num(8, 9, 2);
	}
}
