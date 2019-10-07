package day21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class day2110 {
	public static void main(String[] args) {
		Student s1 = new Student("张三", 20);
		Teacher t1 = new Teacher("张三丰", 120, "清华");
		s1.setTeacher(t1);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("/home/shengzhen/Student.ser");
			// 过滤流,将一个对象写到输出流中
			oos = new ObjectOutputStream(fos);
			// 将对象s1写到输出流中
			oos.writeObject(s1);
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		} finally {
			try {
				oos.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
