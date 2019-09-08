package day15;

public class Day1502 {
	public static void main(String[] args) {
		Animal a1 = new Animal("wang cai", "China farm dog");
		//Animal继承Object类,因此继承了toString方法
		//toString方法用于将对象的内容转换为String
		//Object类的toString方法将返回对象所属的类以及哈希码
		//可以重写toString方法,以获得格式化的对象的内容
		String str = a1.toString();
		//day15.Animal@15db9742
		//Animal [name=, type=]
		System.out.println(str);
		//Animal [name=, type=]
		//System.out.println(Object x)内部会调用对象的toString方法
		System.out.println(a1);
	}
}
