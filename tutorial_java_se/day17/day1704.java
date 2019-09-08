package day17;

public class day1704 {
	public static void main(String[] args) {
		String str = null;
		//在一个null对象上调用方法会导致NullPointerException,空指针异常
		str.toString();
		//下面的语句不会得到执行,因为异常会导致程序执行终止
		System.out.println("hello error");
	}
}
