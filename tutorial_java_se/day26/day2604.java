package day26;

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
}
/*
 * 反射和类对象 JAVA反射机制是在运行状态中,对于任意一个实体类,都能够知道这个类的所有属性和方法;对于任
意一个对象,都能够调用它的任意方法和属性;这种动态获取信息以及动态调用对象方法的功能称为java语言的反射
机制。 当一个类被java虚拟机加载,那么它会创建一个类对象。每一个类都有并且只有一个类对象。类对象保存了类
的信息。这个类对象的类型是java.lang.Class。 获取类对象的方式:
 * */
public class day2604 {
	public static void main(String[] args) throws ClassNotFoundException {
		// 获取Student类的类对象
		// 1,类名.class
		Class<Student> c1 = Student.class;
		System.out.println(c1);
		// 2使用继承于Object类的getClass方法来获取一个类对象
		Student s = new Student("张三", 20);
		Class<Student> c2 = (Class<Student>) s.getClass();
		System.out.println(c2);
		// 3,使用Class的静态方法通过类名获取类对象
		Class<Student> c3 = (Class<Student>) Class.forName("day26.Student");
		// 每个类的类对象只有一个
		System.out.println(c1 == c2);// true
		System.out.println(c1 == c3);// true
		// 接口也有类对象
		Class c4 = Comparable.class;
		System.out.println(c4);
		// 基本类型也有类对象
		Class c5 = int.class;
		System.out.println(c5);
		Class c6 = Integer.class;
		System.out.println(c5 == c6);// false
		// 数组也有类对象
		Class c7 = int[].class;
		System.out.println(c7);
		// java中所有的类型都有类对象,类对象包含了类型的信息
	}
}
