package day12;

class Circle{
	double redius;
	// alt + shift + s
	public Circle(double re) {
		//super();
		//this.redius = re;
		redius = re;
	}

	public double getArea() {
		return Math.PI * redius * redius;		
	}
}
public class calc_area {
	public static void main(String[] args) {
		Circle c = new Circle(3.0);
		System.out.println(c.getArea());
	}
}
