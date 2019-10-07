package day23;

//生产者
public class Productor extends Thread {
	// 仓库
	private Repository rep;

	public Productor(Repository rep) {
		super();
		this.rep = rep;
	}

	@Override
	public void run() {
		// 不断生产
		while (true) {
			synchronized (rep) {
				while (rep.getCount() == 100) {
					// 将当前线程放入rep对象的等待集,它就进入waiting状态
					// waiting状态的线程会放弃锁
					try {
						rep.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				rep.increase();
				// 唤醒在rep对象的等待集中的所有线程
				rep.notifyAll();
				// 唤醒在rep对象的等待集中的一个线程
				//
				rep.notify();
			}
		}
	}
}
