package test;

public class test0806 {
	public static void main(String args[]) {
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		System.out.println(a);
		System.out.println("@hello sunline");
		
		String s ="hello";
		String t ="hello";
		char c[] = {'h','e','l','l','o'};
//		System.out.println(s.equals(t));
//		System.out.println(t.equals(c));
//		System.out.println(s==t);
//		System.out.println(t.equals(new String("hello")));
		Integer var1=new Integer(1);
		System.out.println(var1.intValue());
		Integer var2=var1;
		doSomething(var2);
		System.out.println(var1==var2);
	}
	public static void doSomething(Integer integer) {
		integer=new Integer(2);
	}
}
