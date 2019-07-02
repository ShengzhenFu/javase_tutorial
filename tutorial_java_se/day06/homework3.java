package day06;

import java.util.Scanner;
//3，男大当婚，女大当嫁。如果女方家长要嫁女儿，当然要提出一定的条件。高：180cm以上；富：财富1千万以
//上；帅：是。如果这三个条件同时满足，则：输出我一定要嫁给他，如果三个条件中有为真的情况，则：嫁吧，比上
//不足，比下有余，如果三个条件都不满足，则：不嫁。
//4，编写程序，从键盘接受整数，如果为1-7，打印对应的星期值，否则，打印非法数字。
public class homework3 {
	public int height;
	public int wealth;
	public boolean looking;
	
	public homework3(boolean looking, int height, int wealth){
        this.looking = looking;
        this.height = height;
        this.wealth = wealth;        
    }
	
	public void run() {		
		if (height > 180 && wealth > 10000000 && looking == true) {
			System.out.println("he is "+height+" cm, "
							+ "he has "+wealth+
							" RMB and he is looking handsome "+
							"so go marry him !");}
			else {System.out.println("he is not good enough, don't marry him");}
	}
	
	public static void main(String[] args) {		
		Scanner reader = new Scanner(System.in);
		int height = 0;
		int wealth = 0;
		boolean looking = false;		
		System.out.println("他长得帅吗 ? true or false :");
		while(reader.hasNext()) {
            looking = reader.nextBoolean();            
            System.out.println("他身高多少cm : ");
            height = reader.nextInt();
            System.out.println("他有多少 RMB: ");
            wealth = reader.nextInt();  
            reader.close();
            if (height > 180 && wealth > 10000000 && looking == true) {
    			System.out.println("他身高 "+height+" cm, "
    							+ "拥有 "+wealth+
    							" RMB 而且他长得帅 "+
    							"抓紧嫁给他吧 !");}
    			else {System.out.println("他还不够好, 别嫁给他 ");}
            break;
        }
//		homework3 marry_result = new homework3(looking, height, wealth);
//		marry_result.run();
	}
}
