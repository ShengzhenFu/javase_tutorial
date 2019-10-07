package day22;
//join t1.join方法将导致当前线程等待t1执行完毕。
public class day2205 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + (i + 1));
				}
			}
		});
		// 修改名称为t1
		t1.setName("t1");
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + (i + 1));
				}
			}
		});
		// 修改名称为t2
		t2.setName("t2");
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + (i + 1));
				}
			}
		});
		// 修改名称为t3
		t3.setName("t3");
		t1.start();
		t2.start();
		try {
			// 让当前线程(主线程)暂停执行,等待t2执行结束主线程再恢复执行
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("主线程恢复执行");
		t3.start();
	}
}
