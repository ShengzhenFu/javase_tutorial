package day15;

public class day1522 {
	public static void f1(Integer i){
		System.out.println(i);
		}
		public static void f2(int i){
		System.out.println(i);
		}
		public static void main(String[] args) {
		f1(1);//自动装箱
		f2(new Integer(2));//自动拆箱
		}
}
