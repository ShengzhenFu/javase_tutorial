package day14;

interface Flyable{
	void fly();
}

class FlyableImpl implements Flyable{
	@Override
	public void fly() {
		System.out.println("go to fly !");
	}
public static void main(String[] args) {
	// 需要一个实现了Flyable接口的对象
	Flyable f1 = new FlyableImpl();
	f1.fly();
	// 如果这个对象只需要一个,那么创建一个类去实现接口就太麻烦了
	// 使用匿名内部类可以解决这个问题
	// Flyable后面的大括号中间的内容就是一个匿名内部类
	Flyable f2 = new Flyable() {
		
		@Override
		public void fly() {
			System.out.println("fly fly fly");			
		}
	};
	f2.fly();
	Flyable f3 = new Flyable() {
		
		@Override
		public void fly() {
			System.out.println("fly fly fly fly fly fly");
		}
	};
	f3.fly();
}
}

