package day26;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
//类对象存储了类的信息,因此可以使用类对象来分析类。
public class day2605 {
	public static void main(String[] args) throws ClassNotFoundException {
		String className = "java.lang.String";
// 加载类并获取类对象
		Class c = Class.forName(className);
// 获取父类的类对象
		Class superC = c.getSuperclass();
// 获取类的修饰符
		String modifiers = Modifier.toString(c.getModifiers());
// 打印修饰符
		if (modifiers.length() > 0) {
			System.out.print(modifiers + " class ");
		}
// 打印类名
		System.out.print(c.getName());
// 打印父类名
		if (superC != null && superC != Object.class) {
			System.out.print(" extends " + superC.getName());
		}
// 获取实现的接口
		Class[] ifs = c.getInterfaces();
		System.out.print(" implements ");
// 打印接口
		for (int i = 0; i < ifs.length; i++) {
		System.out.print(ifs[i].getName());
		if (i != ifs.length - 1) {
			System.out.print(", ");
		}
	}System.out.println("{");

// 打印属性
printFields(c);
System.out.println();
// 打印构造方法
printConstructors(c);
System.out.println();
// 打印方法
printMethods(c);
System.out.println("}");
}

	private static void printMethods(Class c) {
// 获取方法
		Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
// 获取修饰符
			String modifiers = Modifier.toString(method.getModifiers());
// 获取返回值类型
			Class returnType = method.getReturnType();
// 获取方法名字
			String name = method.getName();
// 获取方法参数
			Class[] paramTypes = method.getParameterTypes();
// 打印修饰符
			if (modifiers.length() > 0) {
				System.out.print("\t" + modifiers + " ");
			}
// 打印返回值类型
			System.out.print(returnType.getName() + " ");
// 打印方法名字
			System.out.print(name + "(");
// 打印参数类型
			for (int i = 0; i < paramTypes.length; i++) {
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print(paramTypes[i].getName());
			}
			System.out.println(");");
		}
	}

	private static void printConstructors(Class c) {
		Constructor[] cons = c.getConstructors();
		for (Constructor con : cons) {
// 获取修饰符
			String modifiers = Modifier.toString(con.getModifiers());
// 获取构造器的名字
			String name = con.getName();
// 获取参数类型
			Class[] paramTypes = con.getParameterTypes();
// 打印修饰符
			if (modifiers.length() > 0) {
				System.out.print("\t" + modifiers + " ");
			}
// 打印构造器名字
			System.out.print(name + "(");
// 打印参数类型
			for (int i = 0; i < paramTypes.length; i++) {
// 从第二个参数开始打印逗号
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print(paramTypes[i].getName());
			}
			System.out.println(");");
		}
	}

	private static void printFields(Class c) {
// 获取属性,包括继承来的
// c.getFields();
// 获取声明的属性
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields) {
// 获取修饰符
			String modifiers = Modifier.toString(field.getModifiers());
// 获取属性的类型
			Class type = field.getType();
// 获取属性名
			String name = field.getName();
// 打印修饰符
			if (modifiers.length() > 0) {
				System.out.print("\t" + modifiers + " ");
			}
			System.out.println(type.getName() + " " + name + ";");
		}
	}
}
