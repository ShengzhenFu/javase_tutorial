package day22;
//sleep Thread.sleep(long millis)导致当前线程暂停执行指定的时间段。
public class day2204 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + (i + 1));
			try {
				// 让当前线程睡眠1000毫秒
				// 让出执行权,进行睡眠,睡眠结束后再参与cpu执行权的争夺
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
