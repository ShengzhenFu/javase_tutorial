package day27;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/*
 * Callable和Future
Runnable封装一个异步运行的任务,但是没有返回值,Callable与其类似,但是有返回值。 Future用于保存异步运
算的结果,可以启动一个线程进行计算,将Future对象交给它,在计算任务完成后,可以通过Future对象的get方法
来获取结果。
 * */
public class day2707 {
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
		Callable<Integer> c = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				return day2707.f(50);
			}
		};
		FutureTask<Integer> task = new FutureTask<Integer>(c);
		Thread t = new Thread(task);
		t.start();
		// get方法获取计算结果,在线程没有完成计算任务之前,此方法一直阻塞
		System.out.println(task.get());//
	}
}
