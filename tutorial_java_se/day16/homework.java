package day16;
//1,写一个方法判断字符串是否对称。对称的字符串abcdefgfedcba 2,写一个方法将字符串中的大写字符转换为小
//写字符,小写字符转换为大写字符。 String toLowerCase(String str)。abcdeFGH--->ABCDEfgh
public class homework {
	public static boolean f1(String str){
		char[] arrs = str.toCharArray();
		for (int i = 0; i < arrs.length / 2; i++) {
		if(arrs[i] != arrs[arrs.length - i - 1]){
		return false;
		}
		}
		return true;
		}
	
	public static String f2(String str){
		char[] arrs = str.toCharArray();
		for (int i = 0; i < arrs.length; i++) {
		//大写字符
		if(arrs[i] >= 97 && arrs[i] <= 122){
		arrs[i] = (char) (arrs[i] - 32);
		}else if(arrs[i] >= 65 && arrs[i] <= 90){
		arrs[i] = (char) (arrs[i] + 32);
		}else{
		//什么都不做
		}
		}
		return new String(arrs);
		}
	
	public static void main(String[] args) {
		//写一个方法判断字符串是否对称。对称的字符串abcdefgfedcba
		System.out.println(f1("abcdefgfedcba"));//true
		System.out.println(f1("abcdefgfedcca"));//false
		
		System.out.println(f2("abcdEFGH"));
		}
}
