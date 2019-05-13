package day08;

public class function_howto {
	// public function
	// static function
	// void means this function does have return value
	// printX is function name
	public static void printX() {
		/*
		 * suppose to print half rectangle * like below
		 * *
		 * **
		 * ***
		 * ****
		 * ***** 
		 * */
		for (int i =1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printX();
		System.out.println("call printX function success for 1st time");
		
		function_howto x = new function_howto();
		x.printX();
		System.out.println("call printX function success for 2nd time");
		
		function_howto.printX();
		System.out.println("call printX function success for 3rd time");
	}
}
