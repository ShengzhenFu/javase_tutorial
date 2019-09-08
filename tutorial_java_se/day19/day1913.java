package day19;

import java.util.List;
import java.util.Vector;
//Vector实现了List接口,内部由数组实现。但是与ArrayList不同的是,Vector是线程安全的,可以在多线程环境中使
//用。但同时也要注意其效率低于ArrayList
public class day1913 {
	public static void main(String[] args) {
		List<String> vector = new Vector<String>();
		vector.add("a");
		vector.add("b");
		vector.add("c");
		System.out.println(vector);// [a, b, c]
	}
}
