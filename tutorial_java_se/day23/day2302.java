package day23;

public class day2302 {
	public static void main(String[] args) {
		Account account = new Account();
		Thread t1 = new IncreaseThread(account);
		Thread t2 = new DecreaseThread(account);
		t1.start();
		t2.start();
		// 主线程等待t1和t2执行结束
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
