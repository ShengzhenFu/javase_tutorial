package day19;

import java.util.TreeSet;
import java.util.Comparator;
//TreeSet对元素进行排序时需要知道排序规则,有两种方式可以解决: 1,元素实现Comparable接口。 2,创建
//TreeSet时提供一个比较器。
public class day1903_1 {
	public static void main(String[] args) {
		// 传递一个比较器,从大到小排序
		TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.intValue() - o1.intValue();
			}
		});
		set.add(10);
		set.add(20);
		set.add(2);
		set.add(30);
		set.add(5);
		for (Integer integer : set) {
			System.out.println(integer);
		}
		System.out.println("*************************");
		set.add(8);
		for (Integer integer : set) {
			System.out.println(integer);
		}
	}
}
