package day19;

import java.util.ArrayList;
import java.util.List;

//E是泛型参数
//使用泛型类MyList4时,只能使用Number的子类作为泛型参数
//使用E extends Number,表示此泛型类只能使用Number的子类作为泛型参数
class MyList4<E extends Number> {
//
	//private List<E> values = new ArrayList<E>();
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

public class day1905 {
	public static void main(String[] args) {
		// 不能接受String作为泛型参数
		//
		//MyList4<String> list1 = new MyList4<String>();// 编译错误
		MyList4<Integer> list2 = new MyList4<Integer>();
		MyList4<Float> list3 = new MyList4<Float>();
		MyList4<Byte> list4 = new MyList4<Byte>();
	}
}
