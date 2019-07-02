package day06;

import java.util.Scanner;
//从键盘接受整数，如果为1-7，打印对应的星期值，否则，打印非法数字。
public class homework4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int input = 0;				
		System.out.println("请输入1-7的数字:");
		while(reader.hasNext()) {
            input = reader.nextInt();            
            System.out.print("你输入的是 " + input);            
            reader.close();
            switch (input){
            case 1:
                System.out.print(", "+input+" is Monday");
                break;
            case 2:
                System.out.print(", "+input+" is Tuesday");
                break;
            case 3:
                System.out.print(", "+input+" is Wednesday");
                break;
            case 4:
                System.out.print(", "+input+" is Thursday");
                break;
            case 5:
                System.out.print(", "+input+" is Friday");
                break;
            case 6:
                System.out.print(", "+input+" is Saturday");
                break;
            case 7:
                System.out.print(", "+input+" is Sunday");
                break;
            default:
                System.out.println("your input is not in range 1 ~ 7");
                break;
        }
            break;
        }
	}
}
