package day22;

public class Account {
	private int money = 0;

	public void increase() {
		money = money + 1;
	}

	public void decrease() {
		money = money - 1;
	}

	@Override
	public String toString() {
		return "Account [money=" + money + "]";
	}
}
