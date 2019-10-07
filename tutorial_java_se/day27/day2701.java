package day27;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//作业:使用反射,调用String的indexOf,endWith,replace方法。
public class day2701 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		String str = "abc";
		Class<String> c = String.class;
		Method indexOf = c.getDeclaredMethod("indexOf", int.class);
		int index = (int) indexOf.invoke(str, 'c');
		System.out.println(index);
		Method endsWith = c.getDeclaredMethod("endsWith", String.class);
		boolean bool = (boolean) endsWith.invoke(str, "bc");
		System.out.println(bool);
		Method replace = c.getDeclaredMethod("replace", CharSequence.class, CharSequence.class);
		String s = (String) replace.invoke(str, "bc", "BC");
		System.out.println(s);
	}
}
