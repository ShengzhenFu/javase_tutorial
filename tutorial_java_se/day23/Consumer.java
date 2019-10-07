package day23;

//消费者
public class Consumer extends Thread {
	// 仓库
	private Repository rep;

	public Consumer(Repository rep) {
		super();
		this.rep = rep;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (rep) {
				while (rep.getCount() == 0) {
					try {
						// 将当前线程放入rep对象的等待集,它就进入waiting状 态
						// waiting状态的线程会放弃锁
						rep.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				rep.decrease();
				// 唤醒在rep对象的等待集中的所有线程
				rep.notifyAll();
				// 唤醒在rep对象的等待集中的一个线程
				//
				rep.notify();
			}
		}
	}
}
