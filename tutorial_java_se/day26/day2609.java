package day26;

import java.util.Arrays;

public class day2609 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		// int[][] arr = { { 1, 2, 3 }, { 4, 5 }, { 7, 8, 9 } };//正确
		// int[][] arr = { { 1, 2, 3 }, 1, { 7, 8, 9 } };编译错误,每个元素都必须是数组
		// 声明二维数组,相当于一个长度为5的数组,其中的每个元素都是一个长度为6的数组
		int[][] arrA = new int[5][6];
		// 访问二维数组中的元素
		System.out.println(arr[0][0]);// 1,访问第一个数组中的第一个元素
		System.out.println(arr[1][2]);// 6,访问第二个数组中的第三个元素
		// 使用for遍历数组
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		// 使用foreach遍历二维数组
		for (int[] a : arr) {
			for (int number : a) {
				System.out.println(number);
			}
		}
		// 打印二维数组
		System.out.println(arr);// [[I@
		System.out.println(Arrays.toString(arr));// [[I@,[I@]
		System.out.println(Arrays.deepToString(arr));// [[1,2,3],[4,5,6]]
		System.out.println(arr[0]);// [I@ arr[0]是一个一维数组System.out.println(Arrays.toString(arr[0]));// [1,2,3]
	}
}
