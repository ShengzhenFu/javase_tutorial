package day10;

public class variables_func_class {
	// v is class variable
	static int v = 8;
	// PI is class constant
    static final double PI = 3.14;
    
    public static void f1() {
    	int a = 0;
    	if (a == 0) {
    		// x is block variable
    		int x = 3;
    		System.out.println(x);
    	}
    	System.out.println(a);
    	// System.out.println(x); // x is block variable, can't be used outside block
    	System.out.println(v);
    }
    
    static void rect_print() {
    	System.out.println("*****");
    	System.out.println("*****");
    	System.out.println("*****");
    	System.out.println("*****");
    }
	
    // print a rectangle of m rows , n columns of character x
    static void rect_X_print_a(int m, int n,  char x) {
    	int i = 0;
    	int j =0;
    	String y= "";
    	for(j = 0; j<n; j++) {
    		y = y + Character.toString(x);
    	}
    	    	
    	for (i =0 ; i< m; i++) {
    		System.out.println(y);
    	}
    	System.out.println("--------------------");
    }
    
    static void rect_X_print_b(int m, int n,  char x) {
    	for(int i = 0; i < m; i++) {
    		for (int j = 0; j < n; j++) {
    			System.out.print(x);
    		}
    		System.out.println();
    	}	
    }
    
    public static void main(String[] args) {
    	System.out.println(variables_func_class.PI); // class varible PI
    	System.out.println(PI); 
    	// public stataic final doubel PI = 3.1415
    	System.out.println(Math.PI);
    	System.out.println(Math.max(8.9, 3.2));
    	System.out.println("----------------------");
    	variables_func_class.rect_print();
    	System.out.println("---------------------");
    	variables_func_class.rect_X_print_a(4, 5, '$');
    	variables_func_class.rect_X_print_b(4, 5, '@');
    	
    }
}
