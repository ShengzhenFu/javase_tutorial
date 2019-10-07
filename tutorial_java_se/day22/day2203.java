package day22;

class MyThread2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + (i + 1));
		}
	}
}

public class day2203 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread2());
		t1.start();
		Thread t2 = new Thread(new MyThread2());
		t2.start();
	}
}
