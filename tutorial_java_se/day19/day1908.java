package day19;

import java.util.HashMap;
import java.util.Map;
//Map代表了一个映射表,用于保存键值对。map不能包含重复的key,但是value可以重复。每个key只能对应一个
//value。
//HashMap实现了Map接口,HashMap是无序的。它不保存元素的插入顺序,在内部也不保证元素按照大小顺序排
//列
class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

public class day1908 {
	public static void main(String[] args) {
//使用String作为key的类型,Student作为value的类型
		Map<String, Student> map = new HashMap<String, Student>();
//放入三个entry
		map.put("1001", new Student("张三", 20));
		map.put("1002", new Student("李四", 21));
		map.put("1003", new Student("王五", 19));
//通过键获取对应的值
		System.out.println(map.get("1002"));// Student [name=李四, age=21]
//如果key存在,新的value将会替代旧的value
		map.put("1002", new Student("马六", 22));
//通过键获取对应的值System.out.println(map.get("1002"));//Student [name=马六, age=22]
		System.out.println(map);// HashMap重写了toString方法
	}
}
