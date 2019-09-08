package day19;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//TreeMap实现了Map接口和SortedMap接口。其操作和HashMap相同,但它是有序的。TreeMap内部将按照元素的
//key的大小顺序排序。TreeMap和TreeSet一样,要求key实现了Comparable接口,或者在构造TreeMap时提供一个
//Comparator的实例。 key实现Comparable接口
public class day1911 {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(3, "张三");
		map.put(2, "李四");
		map.put(1, "王五");
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println("key: " + key + ",value:" + map.get(key));
		}
	}
}
