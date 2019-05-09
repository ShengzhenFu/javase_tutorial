package day3;
import java.util.Scanner;

public class switcher {
    public int x;
    public static void main(String[] args){
        int x = 0;
        System.out.println("please input a number <= 9: ");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            x = scan.nextInt();
        }
        switch (x){
            case 3: case 5: case 7:
                System.out.println("ODD number");
                break;
            case 4: case 6: case 8:
                System.out.println("even number");
            default:
                System.out.println("min & max number");
        }
    }
}