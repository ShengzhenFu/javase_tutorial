package day07;

public class loop {
	/*
	 * while loop to print 5 stars 3 time
	 */
	void while_loop_print_5stars() {
		int count = 0;
		while(count < 3) {
			System.out.println("   j");
			System.out.println("  ava");
			System.out.println(" javaj");
			System.out.println("avajava");
			System.out.println(" javaj");
			System.out.println("  ava");
			System.out.println("   j");
			count++;
		}
	}
	/*
	 * while loop to print 1234
	 */
	void while_loop_print1234(){
		int count =0;
		while(count<5) {
			System.out.println(count);
			count++;
		}
		System.out.println("***************************");
	}
	/*
	 * for loop with break
	 */
	void while_loop_print12(){
		int count =0;
		while(count<5) {
			System.out.println(count);
			if(count == 2) {
				break;  // the loop will stop at 2
			}
			count++;
		}
		System.out.println("***************************");
	}
	/*
	 * do-while loop  
	 */
	void do_while_loop_print1234() {
		int count =0;
		do {
			System.out.println(count);
			count++;
		}while(count<5);
		System.out.println("***************************");
	}
	/*
	 * FOR loop  
	 */
	void for_loop_basic() {
		for(int i =0; i <5; i++) {
			System.out.println(i);
		}
		System.out.println("***************************");
	}
	/*
	 * nested for loop  
	 */
	void nested_for_loop() {
		for (int i = 0; i < 3; i++) {
			for(int j = 1; j <= 4 ; j++) {
				System.out.println("[i: " + i + ", j: " + j + "]");
			}
		}
		System.out.println("***************************");
	}
	/*
	 * for loop with break
	 */
	void for_loop_break() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				break;  // the loop will stop at 5 
			}
		}
		System.out.println("***************************");
	}
	/*
	 * for loop with continue
	 */
	void for_loop_continue() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				break;  // the loop will skip 5 
			}
		}
	}
	public static void main(String[] args) {
		loop lp = new loop();
		lp.while_loop_print_5stars();
		lp.while_loop_print1234();
		lp.do_while_loop_print1234();
		lp.for_loop_basic();
		lp.nested_for_loop();
		lp.for_loop_break();
		lp.for_loop_continue();
	}
}
