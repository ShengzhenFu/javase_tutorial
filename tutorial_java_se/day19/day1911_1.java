package day19;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Comparator;

public class day1911_1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.intValue() - o1.intValue();
			}
		});
		map.put(1, "王五");
		map.put(3, "张三");
		map.put(2, "李四");
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println("key: " + key + ",value:" + map.get(key));
		}
	}
}
