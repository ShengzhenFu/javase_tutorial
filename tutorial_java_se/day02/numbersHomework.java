package day02;

public class numbersHomework {
	public static void main(String[] args) {
		int minutes = 1000;
		int radius = 5;
		int a = 3;
		int b = 4;
		System.out.println("1000 minutes has \n"+minutes/60+" hours"+"\n"+ minutes%60+" minutes");
		System.out.println("given radius 5\nthe round is "+radius*2*Math.PI+"\nthe area is "+radius*radius*Math.PI);
		System.out.println("max of 3, 4 is "+Math.max(a, b));
	}
}
