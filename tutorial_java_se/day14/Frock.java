package day14;
//将Frock类声明为抽象类，尺寸在Frock类中定义，在类中声明抽象方法calcArea方法，用来计算衣服的布料面
//积。编写Shirt类继承Frock类，实现 calcArea方法，用来计算衬衣所需的布料面积（尺寸 * 1.3）。编写Coat类继承
//Frock类，实现 calcArea方法，用来计算外套所需的布料面积（尺寸*1.5）。编写Test类，测试calcArea方法。
public abstract class Frock {
	protected double size;
	public Frock(double size) {
		super();
		this.size = size;
	}
	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	public abstract double calcArea();
}

class Shirt extends Frock{
	public Shirt(double size) {
		super(size);
	}
	@Override
	public double calcArea() {
		return size*1.3;
	}
}

class Coat extends Frock{
	public Coat(double size) {
		super(size);
	}
	@Override
	public double calcArea() {
		return size*1.5;
	}
}