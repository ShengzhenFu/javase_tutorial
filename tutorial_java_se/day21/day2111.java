package day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class day2111 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("/home/shengzhen/Student.ser");
			// 过滤流,可以从输入流中读取对象
			ois = new ObjectInputStream(fis);
			// 读取到的对象实际是Student类型的对象,因此可以进行强制类型转换
			Student s = (Student) ois.readObject();
			System.out.println(s.getName());
			System.out.println(s.getAge());
			System.out.println(s.getTeacher());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
