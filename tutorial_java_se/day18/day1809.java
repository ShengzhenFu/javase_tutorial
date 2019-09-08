package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//List的排序 Collections.sort()方法可以对List进行排序,前提是List中的元素实现了Comparable接口
public class day1809 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		for (String str : list) {
			System.out.println(str);
		}
		// 按照字母顺序排序
		Collections.sort(list);
		for (String str : list) {
			System.out.println(str);
		}
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(2);
		list1.add(1);
		list1.add(4);
		list1.add(3);
		for (Integer i : list1) {
			System.out.println(i);
		}
		// 对集合中的元素进行排序
		// 按照从小到大的顺序排
		Collections.sort(list1);
		for (Integer i : list1) {
			System.out.println(i);
		}
	}
}
