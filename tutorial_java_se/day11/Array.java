package day11;

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
		// 
		int n = 10;
		int[] arr10 = new int[n];
		
	}
	
}
