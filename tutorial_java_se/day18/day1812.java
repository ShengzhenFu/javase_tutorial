package day18;
import java.util.List;
import java.util.ArrayList;
//将List转化为数组
public class day1812 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		String[] arr = new String[list.size()];// 将list转换为数组
		list.toArray(arr);
		for (String str : arr) {
			System.out.println(str);
		}
	}
}
