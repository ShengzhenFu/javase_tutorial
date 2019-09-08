package day18;

import java.util.ArrayList;
import java.util.List;
//remove有两个重载的方法
public class day1807 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.remove(2);//删除李四
		list.remove("张三");//删除第一个张三,只删一个
		System.out.println(list.size());//2
		for (String str : list) {
		System.out.println(str);
		}
		}
}
