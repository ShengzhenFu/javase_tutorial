package day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class day1614 {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		//返回距1970年1月1日0时0分0秒的毫秒数
		System.out.println(date.getTime());//1562508319386
		System.out.println(date);//Sun Jul 07 22:06:35 CST 2019//对于日期的所有操作都需要将时间转换为毫秒数来进行修改。
		//增加6个小时
		date.setTime(date.getTime() + 6 * 60 * 60 * 1000);
		System.out.println(date);//Mon Jul 08 04:09:12 CST 2019
		//减少6个小时
		date.setTime(date.getTime() - 6 * 60 * 60 * 1000);
		System.out.println(date);//Sun Jul 07 22:10:25 CST 2019
		//可以使用SimpleDateFormat对日期进行格式化。
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
		String str = sdf.format(date);
		System.out.println(str);//2019-07-07:22:14:16
		//将一个字符串解析成一个日期对象
		Date d = sdf.parse("2019-07-07:22:14:16");
		System.out.println(d);//Sun Jul 07 22:14:16 CST 2019
}
}
