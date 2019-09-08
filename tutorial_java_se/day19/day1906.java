package day19;

import java.util.ArrayList;
import java.util.List;
//泛型通配符
public class day1906 {
	public static void main(String[] args) {
		List<Number> list = new ArrayList<Number>();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		List<Double> list2 = new ArrayList<Double>();
		list2.add(1.0);
		list2.add(2.0);
		list2.add(3.0);
		List<String> list3 = new ArrayList<String>();
		list3.add("a");
		list3.add("b");
		list3.add("c");
		// 将list1中的所有元素加入到list中
		list.addAll(list1);
		// 将list2中的所有元素加入到list中
		list.addAll(list2);
		// 将list3中的所有元素加入到list中
		//
		//list.addAll(list3);// 编译错误
		for (Number n : list) {
			System.out.println(n);
		}
	}
}
