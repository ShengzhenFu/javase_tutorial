package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
//从键盘随机输入10个整数,保存到List中,并按照倒序排序,从大到小的顺序显示出来。
public class day1901 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("请输入第" + (i + 1) + "整数");
			list.add(s.nextInt());
		}
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.intValue() - o1.intValue();
			}
		});
		for (Integer i : list) {
			System.out.print(i + ", ");
		}
		s.close();
	}
}
