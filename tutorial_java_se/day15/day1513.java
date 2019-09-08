package day15;

public class day1513 {
	public static void main(String[] args) {
		Integer nineA = new Integer(9);
		Integer nineB = new Integer(9);
		System.out.println(nineA == nineB);//false
		System.out.println(nineA.equals(nineB));//true
		Integer i1 = 9;//自动装箱,Integer i1 = Integer.valueOf(9);
		Integer i2 = 9;//自动装箱,Integer i2 = Integer.valueOf(9);
		//使用Integer.valueOf(int i)方法,如果字面值是-128-127,就会从缓存中获取一个对象
		System.out.println(i1 == i2);//true
		System.out.println(i1.equals(i2));//true
		}
}
