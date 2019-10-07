package day22;
/*
 * 守护线程 java中的线程分为两种:守护线程和非守护线程。
平常使用的都是非守护线程。 守护线程是一种特殊的线程,当java虚拟机中所有的非守护线程都执行完毕后,守护线
程就会终止执行。java中的垃圾回收器GC就是守护线程的典型例子。
 * */
public class day2208 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + (i + 1));
				}
			}
		}, "t1");
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println("守护线程在运行");
				}
			}
		}, "t2");
		// 将t2设置为守护线程
		t2.setDaemon(true);
		t1.start();
		t2.start();
	}
}
