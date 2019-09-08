package day19;

import java.util.Date;

public class day1907 {
	// 泛型方法,<T>是泛型参数声明
	public static <T> void f1(T t) {
		System.out.println(t);
	}

	// 泛型方法,<T>是泛型参数声明,返回值类型是T
	public static <T> T f2(T t) {
		System.out.println(t);
		return t;
	}

	// 泛型方法,<T extends Number>是泛型参数声明
	public static <T extends Number> void f3(T t) {
		System.out.println(t);
	}

	public static void main(String[] args) {
		f1(1);
		f1("a");
		f1(new Date());
		System.out.println(f2('a'));
		f3(2.0);
		//		f3("abc");// 编译错误
	}
}
