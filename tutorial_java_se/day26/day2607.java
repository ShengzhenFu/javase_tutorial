package day26;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class day2607 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Student s1 = new Student("张三", 20);
		Class c = Student.class;
		// 获取getName方法
		Method getName = c.getDeclaredMethod("getName");
		// 在s1对象上调用getName方法并获取返回值
		String name = (String) getName.invoke(s1);
		System.out.println(name);
		// 在s1对象上调用setName方法
		// 获取有一个String类型参数的setName方法
		Method setName = c.getDeclaredMethod("setName", String.class);
		// 在s1对象上调用setName方法,并传递参数李四
		setName.invoke(s1, "李四");
		System.out.println(s1.getName());
	}
}
