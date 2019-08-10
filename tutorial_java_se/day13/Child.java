package day13;

public class Child {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	// 构造器的名称必须和类的名称相同
	// 构造器没有返回值，并且不使用void
	public Child() {
		System.out.println("constructor of Child");
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <= 0 || age >= 150) {
			System.out.println("illegal age!");
			return;
		}
		this.age = age;
	}
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.setName("pony");
		c1.setAge(151);
		System.out.println("the child's name is "+c1.getName()+" and age "+c1.getAge());
	}
}
