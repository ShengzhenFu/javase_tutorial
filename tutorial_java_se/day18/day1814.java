package day18;

import java.util.LinkedList;
import java.util.List;
//LinkedList实现了List接口,LinkedList和ArrayList拥有同样的方法,但是内部的实现却不同。ArrayList内部使用数组
//来实现,LinkedList内部使用链表来实现。 数组是一块连续的内存单元,链表不是连续的内存单元。链表通过引用来
//使链表中的元素关联起来。
public class day1814 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");for (String str : list) {
		System.out.println(str);
		}
		}
}
