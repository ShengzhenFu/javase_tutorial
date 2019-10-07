package day23;

public class IncreaseThread extends Thread {
	private Account account;

	public IncreaseThread(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			account.increase();
		}
	}
}
