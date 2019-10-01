package day22;

class MyThread1 extends Thread {
	/*
	 * when thread activated, it will execute the code in run function
	 * when run function completed, the thread is over
	 * */
	@Override
	public void run() {
		for (int i= 0; i < 1000; i++) {
			/*
			 * getName function return the name of the thread
			 * */
			System.out.println(this.getName() + ":"+i);
		}
	}
}

public class multi_Threads {
	/*
	 * main function will execute by main thread
	 * */
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new MyThread1(); // initialize thread t1
		Thread t2 = new MyThread1(); // initialize thread t2
		/*
		 * start threads
		 * */
		t1.start();
		t2.start();
		
		for (int i =0; i<100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" +i);
		}		
		Thread.sleep(100000);
	}
}
