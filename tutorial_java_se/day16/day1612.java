package day16;

public class day1612 {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder();
		s1.append("world");
		s1.append("peace");
		
		String str = s1.toString();
		System.out.println(str);
		
		System.out.println(Math.sqrt(2.25));//平方根 1.5
		System.out.println(Math.abs(-2));//绝对值 2
		System.out.println(Math.pow(3, 3));//幂值 27.0
		System.out.println(Math.max(3, 4));//最大值4
		System.out.println(Math.min(3, 4));//最小值3
		System.out.println(Math.random());//大于等于0,小于1的double类型的数
		System.out.println(Math.round(14.5));//四舍五入 15
		//5-10之间的随机数
		int i = (int) (Math.random() * 5) + 5;
		System.out.println(i);
	}
}
