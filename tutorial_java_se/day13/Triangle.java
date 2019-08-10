package day13;

public class Triangle {
	private double base;
	private double height;
	public Triangle(double base, double height) {
		this.base=base;
		this.height=height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public static double getArea(Triangle t) {
		return t.getBase() * t.getHeight() / 2;
	}
	public static void main(String[] args) {
		double area = getArea(new Triangle(3.0, 2.0));
		System.out.println(area);
	}
}
