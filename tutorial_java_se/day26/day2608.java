package day26;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class day2608 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		Class c = Student.class;
		// 调用无参构造器来创建对象
		Student s1 = (Student) c.newInstance();
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		// 调用有参构造器来创建对象
		// c.getDeclaredConstructor(new Class[]{String.class, int.class});
		Constructor con = c.getDeclaredConstructor(String.class, int.class);
		Student s2 = (Student) con.newInstance("张三", 20);
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
	}
}
