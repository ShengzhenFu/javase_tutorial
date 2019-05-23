package day11;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		// declare type int[]
		int[] arr;
		// new int array
		arr = new int[10];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 12;
		arr[5] = 31;
		arr[6] = 45;
		arr[7] = 5;
		arr[8] = 7;
		arr[9] = 20;
		
		int a = arr[0];
		System.out.println(a);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		System.out.println(arr[6]);
		System.out.println(arr[7]);
		System.out.println(arr[8]);
		System.out.println(arr[9]);
		
		// declaration of  other types of array
		byte[] arr1 = new byte[5];
		short[] arr2 = new short[5];
		long[] arr3 = new long[5];
		float[] arr4 = new float[5];
		double[] arr5 = new double[5];
		boolean[] arr6 = new boolean[5];
		char[] arr7 = new char[5];
		String[] arr8 = new String[5];
		
		//simple ways to init array
		int[] arr9 = {100, 200, 300, 400, 500};
		System.out.println(arr9[2]); // print 3rd element of arr9
		System.out.println(arr9.length); // length of arr9
		System.out.println(arr9[arr9.length -1]); // last element of arr9
		System.out.println("-----for loop through arr9, for can modify element value------");
		for(int i = 0; i < arr9.length; i ++) {
			System.out.println(arr9[i]);
		}
		System.out.println("-----foreach loop through arr9, foreach can't modify element value------");
		for (int e : arr9) {
			System.out.println(e);
		}	
		System.out.println("-----------");
		int[] arry1 = {1, 2, 3};
		int[] arry2 = {1, 2, 3};
		System.out.println(arry1 == arry2); // false
		System.out.println(Arrays.equals(arry1, arry2)); //true
		
		int [] arry3 = arry1;
		System.out.println(arry3 == arry1);
		System.out.println("-----------");
		/*
		 * copy array address
		 * */
		int[] arry5 = {6, 7, 8};
		int[] arry6 = arry5; // this is copying the address
		arry5[0] = 5;
		System.out.println(arry6[0]);
		
		// copy array value (manually)
		int[] arry7 = {6, 7, 8};
		int[] arry8 = new int[arry7.length]; // arry8 is a new one, independent from arry7
		for(int i = 0; i < arry7.length; i++) {
			arry8[i] = arry7[i];
		}
		arry7[0] = 9;
		System.out.println(arry8[0]);
		
		// copy array by built-in method System.arraycopy(src, srcPos, dest, destPos, length);
		int[] arry9 = {28,29,30};
		int[] arry10 = new int[arry9.length];
		System.arraycopy(arry9, 0, arry10, 0, arry9.length);
		arry9[0] = 50;
		for(int i: arry10) {
		System.out.println(i);
		}
		
		// copy array by built-in method Arrays.copyOf(original, newLength)
		int[] arry11 = {88, 77, 66};
		int[] arry12 = Arrays.copyOf(arry11, 2);
		for (int i : arry12) {
			System.out.println(i);
		}
		System.out.println(arry12.length);
		// Arrays.fill value to array
		int[] arry13 = new int[3];
		Arrays.fill(arry13, 9);
		for (int i : arry13) {
			System.out.println(i);
		}
		//sort 
		Arrays.sort(arry11);
		for (int i : arry11) {
			System.out.println(i);
		}
		// search
		int[] arry14 = {44, 22, 55, 99};
		System.out.println(Arrays.binarySearch(arry14, 55));
		// format array
		System.out.println(Arrays.toString(arry14));
		// 2 dimension array
		int[][] arry22 = {{10, 11}, {20,21,22},{30,31,32}};
		// iterate 2 dimension array
		for (int i = 0; i < arry22.length; i++) {
			for (int j = 0; j < arry22[i].length; j++) {
				System.out.println(arry22[i][j]);
			}
		}
		for (int[] q : arry22) {
			for (int i : q) {
				System.out.println(i);
			}
			System.out.println();
		}
		// print 2 dimension array
		System.out.println(Arrays.deepToString(arry22));
	}
}
