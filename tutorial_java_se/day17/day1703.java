package day17;

import day17.day1702.Day;

public class day1703 {
	public static void main(String[] args) {
		Day d = Day.MONDAY;
		//所有的枚举都隐式继承于java.lang.Enum,java.lang.Enum继承于java.lang.ObjectSystem.out.println(d instanceof Object);//true
		System.out.println(d instanceof Enum);//true
		// 遍历枚举
		// 每一个枚举类都有一个静态的values方法,它是编译器加的
		// 静态的values方法按照声明的顺序返回一个包含所有枚举值的数组
		Day[] arr = Day.values();
		for (Day day : arr) {
			System.out.println(day);
		}
		
		System.out.println("*******************************");
		// 静态的valueOf(String)方法,将字符串转换成枚举值,它是编译器加的
		Day d1 = Day.valueOf("SUNDAY");// 将字符串SUNDAY转换为Day.SUNDAY
		System.out.println(d1);
		// 枚举值转换为字符串
		//toString(),name()是实例方法,继承于java.lang.Enum
		System.out.println(d1.name());// 将Day.SUNDAY转换为字符串SUNDAY
		System.out.println(d1.toString());// 将Day.SUNDAY转换为字符串SUNDAY
		// 获取枚举的序号
		System.out.println(Day.SUNDAY.ordinal());// 0
		System.out.println(Day.MONDAY.ordinal());// 1
		// 枚举的比较
		Day m1 = Day.MONDAY;
		Day m2 = Day.MONDAY;
		System.out.println(m1 == m2);// true
		System.out.println(m1.equals(m2));// true
	}
}
