package day19;

import java.util.TreeSet;
//treeSet实现Set接口和SortedSet接口,其操作和HashSet相同。TreeSet不允许重复元素,但是它将元素按照顺序来
//存储,此顺序不是插入元素的顺序,而是元素的大小顺序。当对TreeSet进行迭代时,它将按照元素的大小顺序来返
//回
public class day1903 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
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
