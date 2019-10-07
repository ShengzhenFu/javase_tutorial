package day23;

public class day2304 {
	public static void main(String[] args) {
		Repository rep = new Repository();
		for (int i = 0; i < 10; i++) {
			Thread p = new Productor(rep);
			p.start();
		}
		for (int i = 0; i < 10; i++) {
			Thread c = new Consumer(rep);
			c.start();
		}
		while (true) {
			System.out.println(rep);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
