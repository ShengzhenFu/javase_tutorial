package day16;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class day1615 {
	public static void main(String[] args) {
		//获取一个Calendar实例
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		//将月中的日修改为24
		cal.set(Calendar.DATE, 24);
		//修改月份为9月
		cal.set(Calendar.MONTH, 8);//8 - September
		//修改年为2010
		cal.set(Calendar.YEAR, 2010);
		System.out.println(cal.get(Calendar.YEAR));//2010
		System.out.println(cal.get(Calendar.MONTH));//8
		System.out.println(cal.get(Calendar.DATE));//24
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));//4
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));//39
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));//267
		System.out.println(cal.getFirstDayOfWeek());//1 -> Calendar.SUNDAY
		//增加5日
		cal.add(Calendar.DATE, 5);System.out.println(cal.getTime());//Wed Sep 29 2010
		//增加1月
		cal.add(Calendar.MONTH, 1);
		System.out.println(cal.getTime());//Fri Oct 29 2010
		//增加2年
		cal.add(Calendar.YEAR, 2);
		System.out.println(cal.getTime());//Mon Oct 29 2012
		//将Calendar对象中的时间点转换为一个Date对象返回
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
		String str = sdf.format(date);
		System.out.println(str);
		}
}
