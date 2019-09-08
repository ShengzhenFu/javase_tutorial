package day18;

import java.util.Arrays;

public class day1802 {
	public static void main(String[] args) {
		//数组不是动态的,一个数组一旦创建,它的容量就是固定的不能被修改。为了添加新的元素,需要创建一个容量更大
		//的数组,并且将数据拷贝到新的数组中。 数组新增元素示例
		int[] arr = new int[5];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		//arr[5] = 5;//java.lang.ArrayIndexOutOfBoundsException
		int[] arr1 = Arrays.copyOf(arr, 6);
		System.out.println(arr1.length);//6
		}
}
