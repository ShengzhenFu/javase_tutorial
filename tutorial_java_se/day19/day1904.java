package day19;

import java.util.ArrayList;
import java.util.List;
//使用泛型创建的类和方法可以支持不同类型的数据。
//自定义的有序列表
class MyList1 {
	private List<Object> values = new ArrayList<Object>();

	public void add(String str) {
		values.add(str);
	}

	public void remove(String str) {
		values.remove(str);
	}
}

//自定义的有序列表
class MyList2 {
	private List<Object> values = new ArrayList<Object>();

	public void add(Integer i) {
		values.add(i);
	}

	public void remove(Integer i) {
		values.remove(i);
	}
}

//E是泛型参数
class MyList3<E> {
//
	// private List<E> values = new ArrayList<E>();
	private List<Object> values = new ArrayList<Object>();

	public void add(E i) {
		values.add(i);
	}

	public void remove(E i) {
		values.remove(i);
	}

	public E get(int index) {
		return (E) values.get(index);
	}
}

public class day1904 {
	public static void main(String[] args) {
		// 泛型的类在使用前需要传递泛型参数
		MyList3<String> list1 = new MyList3<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		String str = list1.get(1);
		System.out.println(str);
		MyList3<Integer> list2 = new MyList3<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		Integer i = list2.get(1);
		System.out.println(i);
	}
}
