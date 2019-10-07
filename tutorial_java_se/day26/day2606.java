package day26;

import com.mysql.jdbc.Field;

public class day2606 {
	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Student s1 = new Student("张三", 20);
		Student s2 = new Student("李四", 21);
		Class c = Student.class;
		// 获取name属性
		java.lang.reflect.Field nameField = c.getDeclaredField("name");
		// 设置访问权限
		nameField.setAccessible(true);
		// 获取s1对象的name属性值
		String nameValue1 = (String) nameField.get(s1);
		// 获取s2对象的name属性值
		String nameValue2 = (String) nameField.get(s2);
		// 获取age属性
		java.lang.reflect.Field ageField = c.getDeclaredField("age");
		// 设置访问权限
		ageField.setAccessible(true);
		// 获取s1对象的name属性值
		int ageValue1 = ageField.getInt(s1);
		// 获取s2对象的name属性值
		int ageValue2 = ageField.getInt(s2);
		System.out.println("s1[name:" + nameValue1 + ", age:" + ageValue1 + "]");
		System.out.println("s2[name:" + nameValue2 + ", age:" + ageValue2 + "]");
	}
}
