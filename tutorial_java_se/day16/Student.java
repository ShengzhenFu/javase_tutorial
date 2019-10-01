package day16;

public class Student {
	private int id;
	private String name;
	private char gender;
	private int age;
	public Student(int id, String name, char gender, int age) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.age = age;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public char getGender() {
	return gender;
	}
	public void setGender(char gender) {
	this.gender = gender;
	}
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
	@Override
	public String toString() {
	return "Student [id=" + id + ", name=" + name + ", gender=" + gender
	+ ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
	final int prime = 31;int result = 1;
	result = prime * result + age;
	result = prime * result + gender;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
	}
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	Student other = (Student) obj;
	if (age != other.age)
	return false;
	if (gender != other.gender)
	return false;
	if (id != other.id)
	return false;
	if (name == null) {
	if (other.name != null)
	return false;
	} else if (!name.equals(other.name))
	return false;
	return true;
	}
}