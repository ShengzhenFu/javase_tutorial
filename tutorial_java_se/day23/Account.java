package day23;

public class Account {
	private int money = 0;

//	public void increase() {
//		synchronized (this) {
//			money = money + 1;
//		}
//	}

	public synchronized void increase() {
		money = money + 1;
	}

//	public void decrease() {
//		synchronized (this) {
//			money = money - 1;
//		}
//	}

	public synchronized void decrease() {
		money = money - 1;
	}

	@Override
	public String toString() {
		return "Account [money=" + money + "]";
	}
}
