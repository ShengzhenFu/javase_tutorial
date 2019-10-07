package day27;

import java.util.Arrays;
/*
 * 比较相邻的元素。如果第一个比第二个大,就交换他们两个。 2、对每一对相邻元素做同样的工作,从开始第一
对到结尾的最后一对。经过第一趟排序后,最后的元素应该会是最大的数。 3、针对所有的元素重复以上的步骤,除
了最后一个。 4、持续每次对越来越少的元素重复上面的步骤,直到没有任何一对数字需要比较。
 * */
public class day204 {
	public static void main(String[] args) {
		int[] arr = { 10, 2, 30, 500, 6980, 333, 2, 31 };
		// 从小到大排
		// 第一趟比较length - 1次
		// 第二趟比较length - 2次
		// 第三趟比较length - 3次
		// 一共比较length - 1趟
		int temp = 0;// 临时变量
		for (int i = 1; i <= arr.length - 1; i++) {
			for (int j = 1; j <= arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
