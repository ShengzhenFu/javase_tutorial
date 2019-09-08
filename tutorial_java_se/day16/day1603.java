package day16;

import java.util.Arrays;

public class day1603 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		String str3 = "hello";
		String str4 = new String("hello");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str2 == str4);
		
		char[] chars = {'a','b','c','d','e','f','g'};
		//通过字符数组构造出一个字符串对象
		String str = new String(chars);
		System.out.println(str);//abcdefg
		//将字符串对象转换为一个字符数组
		char[] arr = str.toCharArray();
		System.out.println(Arrays.toString(arr));
	}
}
