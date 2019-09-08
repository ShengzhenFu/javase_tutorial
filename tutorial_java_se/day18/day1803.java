package day18;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
//Collection接口的使用
public class day1803 {
	public static void main(String[] args) {
		//使用泛型参数String创建的集合,只能向其加入String类型的元素
		Collection<String> c = new HashSet<String>();
		//判断集合是否为空
		System.out.println(c.isEmpty());//true
		//获取集合中元素的数量
		System.out.println(c.size());//0
		c.add("张三");//向集合加入一个元素,元素在集合中是无序存储的
		System.out.println(c.isEmpty());//false
		System.out.println(c.size());//1
		c.add("李四");
		c.add("王五");
		c.add("马六");
		//contains方法需要元素实现了equals方法,它会将传入的元素和集合中的所有元素依次
		//使用equals方法进行比较
		System.out.println(c.contains("王五"));//true
		//删除一个元素,需要元素实现了equals方法
		c.remove("李四");
		//由于Collection集合不记录元素的索引位置,必须使用迭代器来遍历集合
		//获取集合的迭代器
		Iterator<String> i = c.iterator();
		//hashNext方法判断集合中是否还有下一个元素
		//next方法获取集合的下一个元素
		while(i.hasNext()){
		System.out.println(i.next());
		}
		//foreach可以应用于实现了Iterable接口的集合
		//Collection接口继承于Iterable接口,因此Collection所有的子集合都可以获取迭代器
		//foreach内部就是使用迭代器
		for (String str : c) {
		System.out.println(str);
		}
		}
}
