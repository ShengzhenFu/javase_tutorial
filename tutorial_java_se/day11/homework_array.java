package day11;
//1，找出数组中元素的最大值   //2，找出数组中元素的最大值和下标 //3，数组反转[12345]---[54321]
public class homework_array {	
	public static int get_Max_value(int[] arr) {
		int result = Integer.MIN_VALUE;
		for (int i = 0; i <arr.length; i++) {
			if(result < arr[i]) {
				result = arr[i];			}		}
		return result;	} 	
	public static int get_Max_index(int[] arr) {
		int result = Integer.MIN_VALUE; 
		int index = 0;
		for (int i = 0; i <arr.length; i++) {
			if(result < arr[i]) {
				result = arr[i]; 
				index = i;			}		}
		return index;	} 	
	public static void main(String[] args) {		
		System.out.println("排序法找最大值*******************************************");
		int [] array1 = {1, 8, 6, 1, 2};
		java.util.Arrays.sort(array1);
		System.out.println("array{1, 8, 6, 1, 2}数组的最大值是 "+array1[(array1.length-1)]);		
		System.out.println("遍历法找最大值*******************************************");		
		int[] arr = {1, 8, 6, 1, 2};		
		System.out.println("array{1, 8, 6, 1, 2}数组的最大值是 "+get_Max_value(arr));		
		System.out.println("遍历法找最大值下标*******************************************");
		System.out.println("array{1, 8, 6, 1, 2}数组的最大值下标是 "+get_Max_index(arr));
		System.out.println("遍历法数组反转*******************************************");
		int[] reverse_arr = new int[arr.length];
		for (int i = 0; i <= arr.length-1; i++) {
			reverse_arr[arr.length-1 -i] = arr[i];
		}System.out.println(java.util.Arrays.toString(reverse_arr));	}}