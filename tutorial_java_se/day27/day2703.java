package day27;

import javax.swing.Timer;

interface I1 {
	void print();
}

public class day2703 {
	public static void f1(I1 i) {
		i.print();
	}

	public static void main(String[] args) throws InterruptedException {
// 即使没有参数,也需要提供小括号
		I1 i1 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.print("*");
			}
		};
// f1(i1);
// i1.print();
// 定时器,定时执行任务
// 1000毫秒后,通知监听器,并传递事件对象
// Timer t1 = new Timer(1000, new ActionListener() {
//
// @Override
// public void actionPerformed(ActionEvent e) {
// System.out.println("得到通知");
// }
// });
// t1.start();//启动定时器
// 如果方法只有一个参数,并且这个参数类型可以推导出,那么就可以忽略小括号
		Timer t2 = new Timer(1000, e -> System.out.println(e));
		t2.start();
// 让主线程睡10000毫秒
		Thread.sleep(10000);
	}
}
