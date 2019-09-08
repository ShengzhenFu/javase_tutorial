package day18;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	private String name;
	private int age;
	private int sno;

	public Student(String name, int age, int sno) {
		super();
		this.name = name;
		this.age = age;
		this.sno = sno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

//如果返回负数代表我在前,参数在后
//如果返回正数代表我在后,参数在前
	@Override
	public int compareTo(Student o) {
//按照年龄从小到大排
//      return this.age - o.age;
//按照学号从大到小来排
		return o.sno - this.sno;
	}
}

public class day1810 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("张三", 19, 20191101));
		list.add(new Student("李四", 18, 20191102));
		list.add(new Student("王五", 20, 20191103));
		Collections.sort(list);
		for (Student s : list) {
			System.out.println(s);
		}
	}
}
