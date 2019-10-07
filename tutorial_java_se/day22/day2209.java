package day22;
//线程是并行执行的,当两个线程同时修改同一个数据,就会产生线程并发问题。
public class day2209 {
	public static void main(String[] args) {
		Account account = new Account();
		Thread t1 = new IncreaseThread(account);
		Thread t2 = new DecreaseThread(account);
		t1.start();
		t2.start();// 主线程等待t1和t2执行结束
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(account);//
	}
}
