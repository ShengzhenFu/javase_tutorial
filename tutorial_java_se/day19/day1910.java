package day19;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
//LinkedHashMap是HashMap的子类,并且其操作和HashMap相同。HashMap是无序的,不保留元素的插入顺序,
//LinkedHashMap保留元素的插入顺序。当对LinkedHashMap进行迭代时,它将按照元素添加的顺序返回
public class day1910 {
	public static void main(String[] args) {
		//
		//Map<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("a", "A");
		map.put("c", "C");
		map.put("b", "B");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println("key:" + key + ",value:" + map.get(key));
		}
	}
}
