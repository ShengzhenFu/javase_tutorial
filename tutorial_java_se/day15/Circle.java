package day15;

public class Circle implements Areable{
	private double r;
	public Circle(double r) {
		super();
		this.r = r;
		}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public double getArea() {
		return r * r * Math.PI;
	}
}
	