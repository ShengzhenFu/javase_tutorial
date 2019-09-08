package day19;

import java.util.LinkedList;
import java.util.Queue;
//Queue为队列,队列是一种先进先出(FIFO)的数据结构。
public class day1912 {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		// 将元素插入队列
		q.offer("a");
		q.offer("b");
		q.offer("c");
		System.out.println(q);// [a, b, c]
		// 获取但不移除队列的头
		System.out.println(q.peek());// a
		System.out.println(q);// [a, b, c]
		// 获取并移除队列的头
		System.out.println(q.poll());// a
		System.out.println(q);// [b, c]
		System.out.println(q.poll());// b
		System.out.println(q.poll());// c
		System.out.println(q);// []
	}
}
