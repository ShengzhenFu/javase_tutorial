package day18;

import java.util.ArrayList;
import java.util.List;
//set方法用于替换指定位置的元素
public class day1806 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.set(1, "马六");
		for (String str : list) {
			System.out.println(str);
		}
	}
}
