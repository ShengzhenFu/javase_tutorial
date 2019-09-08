package day14;

import javafx.scene.chart.BarChart;

public class Foo {
	private int v1;
	public Foo(int v1) {
		super();
		this.v1 = v1;
	}
	public void fooF() {
		Bar bar = new Bar();
		bar.barF();
	}
	public class Bar{
		public void barF() {
			System.out.println(v1);
		}
	}
	public static void main(String[] args) {
		Foo foo = new Foo(10);
		foo.fooF();
		//创建内部类的对象必须先有外部类的对象
		//使用foo.new Bar(),编译器会将foo作为参数传递给Bar的构造器
		Bar bar = foo.new Bar();
		bar.barF();//10
		//bar和bar2持有同一个外部类对象的引用
		Foo.Bar bar2 = foo.new Bar();
		bar2.barF();//10
	}
}
