package day18;

import java.util.List;
import java.util.ArrayList;

public class day1808 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add("张三");
		list.add("张三");
		list.add("张三");
		for (int i = 0; i < list.size(); i++) {
			int index = list.indexOf("张三");
			if (index != -1) {
				list.remove(index);
				i--;
			}
		}
		for (String str : list) {
			System.out.println(str);
		}
	}
}
