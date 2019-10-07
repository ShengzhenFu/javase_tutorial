package day22;
/*
 * interrupt
t1.interrupt会将设置t1线程为中断状态,但不会导致t1线程立即终止执行。 被中断的线程可以选择继续执行,也可
以选择停止执行
 * */
public class day2207 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					// 检查当前线程是否被打断
					// isInterrupted()返回中断状态
					if (Thread.currentThread().isInterrupted()) {
						System.out.println("被打断了");
						break;
					} else {
						System.out.println(Thread.currentThread().getName() + (i + 1));
					}
				}
			}
		});
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 打断线程t1,设置t1的中断状态为true
		t1.interrupt();
	}
}
