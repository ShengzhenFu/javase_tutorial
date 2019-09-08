package day20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
////流实现文件的读写
//FileReader 提供了关于读文件的基本操作
public class day2007 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			// 创建一个输入流
			//fr = new FileReader("E:/test/test.txt");
			fr = new FileReader("/home/shengzhen/test_javaio_test.txt");
			// 从流中读
			//
			System.out.println((char) fr.read());// 读取一个字符
			char[] chars = new char[256];
			// 将文件中的内容读到字符数组中,尝试读取chars.length个
			// 返回实际读到的字符数
			int bs = fr.read(chars);
			char[] arr = Arrays.copyOf(chars, bs);
			String str = new String(arr);
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
