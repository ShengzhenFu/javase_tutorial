package day19;

import java.util.Hashtable;
import java.util.Map;
//HashTable实现了Map接口,其操作和HashMap类似。但是HashTable是线程安全的。但是要注意其效率低于
//HashMap。
public class day1914 {
	public static void main(String[] args) {
		Map<Integer, String> map = new Hashtable<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
	}
}
