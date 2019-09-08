package day18;

import java.util.ArrayList;
import java.util.List;
//ArrayList可以保存重复元素
public class day1805 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//List允许重复元素
		list.add("张三");
		list.add("张三");
		System.out.println(list.size());//2
		for (String str : list) {
		System.out.println(str);
		}
		System.out.println(list.indexOf("张三"));//0
		list.add(0, "李四");
		for (String str : list) {
		System.out.println(str);
		}
		}
}
