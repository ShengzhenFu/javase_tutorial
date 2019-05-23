package day11;

import day02.numbers;

public class array_variable {
	public static void func(int[] n) {
		n[0] = 9;
	}
	public static void main(String[] args) {
		int[] a = {10, 11, 12};
		func(a); //copy the value of actual param a to formal param n, now a and n are using same array{9, 11, 12}
		System.out.println(a[1]);
		
	}
}
