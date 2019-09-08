package day18;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//使用比较器进行排序
class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
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
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class day1811 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("张三", 19));
		list.add(new Person("李四", 18));
		list.add(new Person("王五", 20));
		// 元素不实现Comparable接口,可以传递一个比较器
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// 按照年龄从小到大排
				return o1.getAge() - o2.getAge();
			}
		});
		for (Person p : list) {
			System.out.println(p);
		}
	}
}
