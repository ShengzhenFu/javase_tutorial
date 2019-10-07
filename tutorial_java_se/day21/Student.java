package day21;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private int age;
	// private transient int age;private Teacher teacher;
	private Teacher teacher;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Teacher getTeacher() {
		return teacher;
		}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
		}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}	
}
