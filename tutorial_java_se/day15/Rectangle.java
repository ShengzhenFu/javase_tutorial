package day15;

public class Rectangle implements Areable{
	private double x;
	private double y;
	public Rectangle(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public double getArea() {
		return x * y;
	}
	
}
