package day15;

public class day1511 {
	public static void main(String[] args) {
		//自动装箱,将1包装成一个Integer对象,然后将地址赋值给i1
		//编译后,调用类方法Integer.valueOf(int i);
		//相当于Integer i1 = Integer.valueOf(1);
		Integer i1 = 1;
		//自动拆箱,取出i1引用对象的值,然后赋值给i2
		//编译后,调用实例方法i1.intValue();
		//相当于int i2 = i1.intValue();
		int i2 = i1;
		System.out.println(i1);
		System.out.println(i2);
		Integer ten = new Integer(10);ten++;//先自动拆箱,再自动装箱
		}
}
