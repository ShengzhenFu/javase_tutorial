package day03;
import java.util.Scanner;

public class switcher {
    public int x;
    public char y;
    public String z;
    
    void switch_numbers(){
    	int x = 0;
        System.out.println("please input a number <= 9: ");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            x = scan.nextInt();
        break;
        }
        System.out.println("your input number is "+x);
        switch (x){
            case 3: case 5: case 7:
                System.out.println(x + " is ODD number");
                break;
            case 2: case 4: case 6: case 8:
                System.out.println(x+" is even number");
                break;
            case 1:
            	System.out.println(x+" is minimum number");
            case 9:
            	System.out.println(x+" is maximum number");
            default:
                System.out.println("your input is not in range 1 ~ 9");
                break;
        }
    }
    void switch_string() {
    	String y = "";
    	System.out.println("Please input one string");
    	Scanner scan = new Scanner(System.in);
    	while(scan.hasNext()) {
    		y = scan.nextLine();
    	break;
    	}
    	System.out.println("your input string is "+y);
    	switch(y) {
	    	case "abc":
	    		System.out.println("abc matched !");
	    		break;
	    	case "def":
	    		System.out.println("def matched !");
	    		break;
	    	case "gh":
	    		System.out.println("gh matched !");
	    		break;
	    	default:
	    		System.out.println("None matched !");
	    		break;
    	}
    }
    void switch_char() {
    	char z ='f';
    	System.out.println("please input one letter a ~ z or A ~ Z");
    	Scanner scan = new Scanner(System.in);
    	while(scan.hasNext()) {
    		z = scan.next().charAt(0);
    		break;
    	}
    	System.out.println("your input letter is "+z);
    	switch(z) {
	    	case 'a':
	    		System.out.println("a matched !");
	    		break;
	    	case 'b':
	    		System.out.println("b matched !");
	    		break;
	    	case 'c':
	    		System.out.println("c matched !");
	    		break;
	    	default:
	    		System.out.println("None matched !");
	    		break;
        	}
    	}
    public static void main(String[] args){
    	switcher swn = new switcher();
    	swn.switch_numbers();
    	swn.switch_string();
    	swn.switch_char();
    }
}