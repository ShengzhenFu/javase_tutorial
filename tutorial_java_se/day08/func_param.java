package day08;

public class func_param {
	// function with single parameter
	public static void printX(int n) {
		/* n is parameter, it is used as variable to pass to function
		 * the type of parameter n is integer
		 *  
		 * */
		for (int i =1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// function with multiple parameter
	public static void printXY(int n, char s) {
		/* n and s are parameters, they are variables to pass to function
		 * is the type of parameter
		 *  
		 * */
		for (int i =1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
	/* function that return value 
	 * function to sum up from start to end
	 * start and end are parameters of integer
	 * */
	public static int sum(int start, int end) {
		int sum =0;
		if(start > end) {
			System.out.println("1st parameter shall be greater than 2nd parameter");
			return 0;
		}
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		return sum; // return
	}
	
	public static void main(String[] args) {
		int x = 6; // x is the value to pass to printX function parameter
		printX(x);
		System.out.println("end of call on function printX(n) ");
	
		int y = 5;
		char z = '$';
		printXY(y, z); // y,z are 2 parameters
		System.out.println("end of call on function printX(n, s) ");
		
		int m = sum(7, 5);		
		System.out.print(m);
		System.out.println("\nend of call on function sum(start, end) ");
	}
}
