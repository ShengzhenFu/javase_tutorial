package day13;

import day12.thisAnimal;

public class Pet extends Animal{

	public String catagory;

	public Pet(String name, int age, String type, String category) {
		super(name, age, type);
		this.catagory = category;
	}
	

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public static void main(String[] args) {
		Pet p1 = new Pet("cat", 1, "short hair", "CN cat");
		//p1.setCatagory("siam cat");
		System.out.println(p1.getCatagory());
	}
}
