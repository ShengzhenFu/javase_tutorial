package day27;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 线程池
创建一个新的线程是有一定代价的,因为涉及与操作系统的交互。如果程序中创建了大量的生命期很短的线程,应该
使用线程池。一个线程池中包含了许多准备运行的空闲线程。将Runnable对象交给线程池,就会有一个线程调用其
run方法,当run方法结束后,线程不会死亡,而是在池中准备为下一个请求提供服务。 执行器Executors类有很多静
态方法用来创建线程池: newCachedThreadPool方法构建了一个线程池,对于每个任务,如果有空闲线程可用,立
即让它执行任务,如果没有可用的空闲线程,则创建一个新线程。 newFixedThreadPool方法构建一个有固定大小的
线程池,如果提交的任务数多于空闲的线程数,那么任务会被放置到队列中,当其他任务完成后再运行它们。
newSingleThreadExecutor是一个大小为1的线程池,由一个线程执行提交的任务,一个接一个。
 * */
public class day2708 {
	public static int f(int n) {
		int result = 0;
		if (n == 1 || n == 2) {
			result = 1;
		} else {
			result = f(n - 1) + f(n - 2);
		}
		return result;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Integer> c1 = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				return day2708.f(10);
			}
		};
		Callable<Integer> c2 = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				return day2708.f(20);
			}
		};
		Callable<Integer> c3 = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				return day2708.f(30);
			}
		};
		// 创建5个线程的线程池
		ExecutorService es = Executors.newFixedThreadPool(5);
		// 提交任务c1
		Future<Integer> f1 = es.submit(c1);
		// 提交任务c2
		Future<Integer> f2 = es.submit(c2);
		// 提交任务c3
		Future<Integer> f3 = es.submit(c3);
		System.out.println(f1.get());
		System.out.println(f2.get());
		System.out.println(f3.get());
		// 关闭线程池
		es.shutdown();
	}
}
