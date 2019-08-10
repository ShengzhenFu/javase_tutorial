package day14;

public class Student extends Person {
	private int sno;
	private int score;
	public Student(int age, String name, int sno, int score) {
		super(age, name);
		this.sno = sno;
		this.score = score;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String showInfo() {
		return super.Say()+", sno is "+sno+", score is "+score;
	}
	
}
