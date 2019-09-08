package day17;

import java.io.IOException;
import java.text.ParseException;

public class day1709 {
	// f1方法声明其将抛出多个异常
	public static void f1() throws IOException, ParseException {
	int a = 0;
	if (a == 0) {
	throw new IOException("IOException");
	} else {
	throw new ParseException("解析错误", 1);
	}
	}
	//
	//public static void main(String[] args) {
	// //main方法需要捕获多个异常
	// try {
	//
	//f1();
	//
	//} catch (IOException e) {
	// e.printStackTrace();
	// } catch (ParseException e) {
	//
	//e.printStackTrace();
	//
	//
	//}
	//}
	public static void main(String[] args) {
	//main方法可以捕获父类的异常
	try {
	f1();
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
}
