package day09;

public class func_overload {
	/*
	 * function max(a, b) 
	 * */
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	
	/*
	 * function max(a, b, c) considered different since it has different number of parameter 
	 * */
	public static int max(int a, int b, int c) {
		return a > b ? (a > c ? a : c) : (b > c ? b :c);
	}
	
	/*
	 * function max(a, b) considered different since it has different type parameter 
	 * */
	public static double max(double a, double b) {
		return a > b ? a : b;
	}
	
		
	public static void main(String[] args){
		System.out.println(max(3, 5));
		System.out.println(max(3, 5, 6));
		System.out.println(max(4.5, 6.1));
		/*
		 * summary : function overload enable us to use same function name with different parameters,
		 * 			  so we don't have to use different functions with same purpose
		 * */
	}
}
