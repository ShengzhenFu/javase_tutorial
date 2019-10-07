package day27;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * lambda表达式是一个可以传递的代码块,可以在以后执行一次或多次。
对于只有一个抽象方法的接口,当需要这种接口类型的对象时,就可以提供一个lambda表达式
 * */
public class day2702 {
	public static void main(String[] args) {
		Comparator<String> comp1 = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};
		// 对于只有一个抽象方法的接口,当需要这种接口类型的对象时,就可以提供一个lambda表达式
		// lambda表达式是一个可以传递的代码块,可以再以后执行一次或多次
		Comparator<String> comp2 = (String o1, String o2) -> {
			return o1.length() - o2.length();
		};// 如果可以推导出一个lambda表达式的参数类型,则可以忽略其类型
		Comparator<String> comp3 = (o1, o2) -> {
			return o1.length() - o2.length();
		};
		// lambda表达式的返回值类型可以推导得出,因此无需指定返回值类型
		Comparator<String> comp4 = (o1, o2) -> o1.length() - o2.length();
		TreeSet<String> set = new TreeSet<String>(comp4);
		set.add("abc");
		set.add("bc");
		set.add("d");
		set.add("cdef");
		set.add("badced");
		set.add("c");
		System.out.println(set);
	}
}
