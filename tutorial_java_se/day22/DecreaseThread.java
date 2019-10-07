package day22;

public class DecreaseThread extends Thread {
	private Account account;

	public DecreaseThread(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			account.decrease();
		}
	}
}
