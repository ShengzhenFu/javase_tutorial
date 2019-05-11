package day6;

public class condition {
	public static void main(String[] args) {
		if(true) {
			System.out.println("print when condition is true");
		}
		/*
		 * basic if else condition
		 * */
		int a = 9;
		if(a ==9) {
			System.out.println("a==9");
		}else {
			System.out.println("a!=9");
		}
		/*
		 * basic if else if condition
		 * */
		int b = 20;
		if(b==0) {
			System.out.println("b==0");
		}else if(b<10) {
			System.out.println("b<10");
		}else if(b>10 && b<20) {
			System.out.println("b>10 && b<20");
		}else {
			System.out.println("b >= 20");
		}
		/*
		 * nested if else if condition
		 * */
		int c = 30;
		if(c >= 60 && c <= 100) {
			if(c>=90) {
				System.out.println("excellent");
			}else if(c>=80) {
				System.out.println("good");
			}else {
				System.out.println("normal");
			}
		}else if(c<60){
			System.out.println("fail");
		}else {
			System.out.println("score should not be greater than 100");
		}
			}
		
	}
