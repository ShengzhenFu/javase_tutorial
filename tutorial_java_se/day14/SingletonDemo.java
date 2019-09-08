package day14;

//单例模式
//当类加载时创建一个实例
//由于类只会加载一次,所能能保证创建唯一的对象
public class SingletonDemo {
	private static SingletonDemo instanceDemo = new SingletonDemo(); 
	private SingletonDemo() {
		
	}
	public static SingletonDemo getInstance() {
		return instanceDemo;
	}
	public static void main(String[] args) {
		SingletonDemo s1 = SingletonDemo.getInstance();
		SingletonDemo s2 = SingletonDemo.getInstance();
		System.out.println(s1 == s2);
	}
}
