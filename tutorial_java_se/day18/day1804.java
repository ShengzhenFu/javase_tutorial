package day18;

import java.util.ArrayList;
import java.util.List;
//ArrayList实现了List接口,它保存元素的添加顺序。ArrayList的内部实现是一个数组
public class day1804 {
	public static void main(String[] args) {
		//创建了一个ArrayList集合,可以保存Integer类型的对象
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);//自动装箱
		list.add(2);
		list.add(3);
		//List集合保留元素的添加顺序
		for (int i = 0; i < list.size(); i++) {
		//get方法获取指定索引处的元素
		System.out.println(list.get(i));
		}
		}
}
