package day24;

public class TransferThread extends Thread {
	private int[] account;

	public int[] getAccount() {
		return account;
	}

	public void setAccount(int[] account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			synchronized (account) {
				int from = (int) (10 * Math.random());
				int to = (int) (10 * Math.random());
				int amount = (int) (1000 * Math.random());
				while (account[from] < amount) {
					try {
						account.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				account[from] = account[from] - amount;
				account[to] = account[to] + amount;
				account.notifyAll();
			}
		}
	}
}
