package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//HashMap的遍历 HashMap的遍历,HashMap没有实现iterable接口,因此不能使用foreach进行遍历。但是它的
//keySet方法可以返回其key的集合。
public class day1909 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "A");
		map.put("b", "B");
		map.put("c", "C");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println("key:" + key + ",value:" + map.get(key));
		}
		Set<Map.Entry<String, String>> entrys = map.entrySet();
		for (Map.Entry<String, String> entry : entrys) {
			System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
		}
	}
}
