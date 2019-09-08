package day18;

//写一个TestException类,在main方法中接受两个命令行参数,将他们转换成整数,
//并用第二个数除以第一个数,打印结果。测试一下情况,某个参数不是数字,第一个参数为0.
public class day1801 {
	public static void main(String[] args) {
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			System.out.println(n2 / n1);
		} catch (NumberFormatException e1) {
			System.out.println("参数必须为整数");
		} catch (ArithmeticException e2) {
			System.out.println("不能除0");
		}
	}
}
