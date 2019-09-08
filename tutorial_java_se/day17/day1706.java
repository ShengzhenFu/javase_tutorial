package day17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class day1706 {
	public static void main(String[] args) {
		System.out.println("请输入日期字符串:yyyy-MM-dd");
		Scanner s = new Scanner(System.in);
		//用户输入的日期字符串
		String str = s.nextLine();//yyyy-MM-dd
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
		//如果str和预期的格式不匹配,将解析错误,并抛出ParseException
		Date date = sdf.parse(str);
		System.out.println(date);
		} catch (ParseException e) {
		System.out.println("格式不正确,请检查");
		}
		}
}
