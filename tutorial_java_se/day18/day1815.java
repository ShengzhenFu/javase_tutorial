package day18;

import java.util.HashSet;
import java.util.Set;

//Set接口继承于Collection接口,因此它拥有Collection接口的所有方法。它并没有添加新的方法,只是约定不能添加
//重复的元素
public class day1815 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("张三");
		set.add("李四");
		set.add("王五");
		set.add("马六");
		System.out.println(set.add("张三"));// false,没有添加成功
		// 对Set进行迭代,每次的顺序都是一致的
		for (String str : set) {
			System.out.println(str);
		}
	}
}
