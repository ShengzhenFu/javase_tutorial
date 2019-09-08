package day17;

public class day1702 {
	//使用enum关键字声明一个枚举类
	public enum Day {
	//枚举类的值,类型是Day
	SUNDAY,//星期天
	MONDAY,//星期一
	TUESDAY,//星期二
	WEDNESDAY,//星期三
	THURSDAY,//星期四
	FRIDAY,//星期五
	SATURDAY//星期六
	}
	public static void main(String[] args) {
		//枚举是一种特殊的类型,它的值是一组预定义的常量。
		//d是一个枚举类型的变量,它的类型是Day,Day.MONDAY是一个枚举值
		Day d = Day.FRIDAY;
		switch (d) {
		case MONDAY:
		System.out.println("星期一");
		break;
		case TUESDAY:
		System.out.println("星期二");
		break;
		case WEDNESDAY:
		System.out.println("星期三");
		break;
		case THURSDAY:
		System.out.println("星期四");
		break;
		case FRIDAY:
		System.out.println("星期五");
		break;
		case SATURDAY:
		System.out.println("星期六");
		break;
		case SUNDAY:
		System.out.println("星期天");
		break;
		}
	}
}
