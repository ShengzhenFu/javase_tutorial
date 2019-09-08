package day19;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//LinkedHashSet是HashSet的子类,并且其操作和HashSet相同。LinkedHashSet不允许重复的元素,但是保留插入
//元素的顺序。当对LinkedHashSet进行迭代时,它会按照元素的添加顺序来返回
public class day1902 {
	public static void main(String[] args) {
		//Set<String> set = new HashSet<String>();
		Set<String> set = new LinkedHashSet<String>();
		set.add("zhangsan");
		set.add("lisi");
		set.add("wangwu");
		for (String str : set) {
			System.out.println(str);
		}
	}
}
