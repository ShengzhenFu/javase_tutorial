package day16;

public class day1601 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "张三", '男', 20);
		Student s2 = new Student(2, "李四", '女', 21);
		System.out.println(s1.equals(s2));//false
		System.out.println(s1);
		System.out.println(s2);
	}
}
