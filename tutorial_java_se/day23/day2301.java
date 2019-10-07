package day23;
/*
 * 继承Thread类创建一个线程t1,实现Runnable接口创建一个线程t2。t1中使用for循环输出1000次自己的名字,
每次输出后睡眠10毫秒,t2中使用for循环输出1000次自己的名字,每次输出后睡眠20毫秒。让主线程等待t1和t2都
执行结束,主线程才恢复执行
 */
class MyThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + (i + 1));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + (i + 1));
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class day2301 {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new Thread(new MyThread2());
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("主线程恢复执行");
	}
}
