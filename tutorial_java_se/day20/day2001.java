package day20;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class day2001 {
	public static void main(String[] args) {
		// TreeSet<Integer> set = new TreeSet<Integer>();
		// Scanner s = new Scanner(System.in);
		// for (int i = 0; i < 5; i++) {
		//		System.out.println("请输入第" + (i + 1) + "个整数");
		//		set.add(s.nextInt());
		//		}
		//
		//		for (Integer i : set) {
		//		System.out.println(i);
		//		}
		//
		//		s.close();
		TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
		return o2.intValue() - o1.intValue();
		}
		});
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
		System.out.println("请输入第" + (i + 1) + "个整数");
		set.add(s.nextInt());
		}
		for (Integer i : set) {
		System.out.println(i);
		}
		s.close();
		}
}
