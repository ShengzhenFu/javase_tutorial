package day27;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/*
 * 定时执行任务
执行器Executors类可以创建用于执行定时任务的线程池。
newScheduledThreadPool方法获取一个线程池,它用给定的线程数来调度任务。
 * */
public class homework2702 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Integer> c = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				return homework2701.f(10);
			}
		};
		// 创建一个容量为5的定时执行的线程池
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(5);
		// 2秒后执行任务
		ScheduledFuture<Integer> future = ses.schedule(c, 2, TimeUnit.SECONDS);
		// 获取计算结果
		System.out.println(future.get());
		// 关闭线程池
		ses.shutdown();
	}
}
