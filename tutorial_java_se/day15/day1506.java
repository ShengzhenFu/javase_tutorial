package day15;

public class day1506 {
	public static void main(String[] args) {
		Integer i = null;
		//Integer i = 1 ;
		int a = 10;
		short s = (short) a;
		i  = new Integer(10);
		short ss = i.shortValue();
		System.out.println(i+" "+a+" "+ss);
		
		Integer i1 = new Integer(10);
		Integer i2 = Integer.valueOf(10);
		Integer i3 = Integer.valueOf("10");
		Integer i4 = Integer.valueOf("111", 2);//7
		System.out.println(i1);//10
		System.out.println(i2);//10
		System.out.println(i3);//10
		System.out.println(i4);//7
		Long.valueOf(10L);
		
		int i11 = Integer.parseInt("10");
		System.out.println(i11);//10
		int i12 = Integer.parseInt("11101", 2);
		System.out.println(i12);//29
		
		String str1 = Integer.toString(10);
		System.out.println(str1);
		String str2 = Integer.toString(7, 2);
		System.out.println(str2);
		//0123456789abcdef
		System.out.println(Integer.toHexString(12));//十六进制,c
		System.out.println(Integer.toBinaryString(10));//二进制,1010
		//01234567
		System.out.println(Integer.toOctalString(10));//八进制,12
		//1+8+64
		System.out.println(Integer.valueOf("111", 8));
	}
}
