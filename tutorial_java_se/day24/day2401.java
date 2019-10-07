package day24;
/*
 * 模拟银行转账的业务,有10个账户,每个账户初始金额为10000,有10个线程随机选择两个账户进行转账,每次
转的金额是1000以内的。每个线程转100次。最后输出10个账户的总金额。
 * */
public class day2401 {
	public static void main(String[] args) {
		int[] accounts = new int[10];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = 10000;
		}
		TransferThread[] threads = new TransferThread[10];
		for (int i = 0; i < 10; i++) {
			TransferThread t = new TransferThread();
			t.setAccount(accounts);
			t.start();
			threads[i] = t;
		}
		// for (int i = 0; i < threads.length; i++) {
		// try {
		// threads[i].join();
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// }
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int sum = 0;
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i]);
			sum = sum + accounts[i];
		}
		System.out.println(sum);
	}
}
