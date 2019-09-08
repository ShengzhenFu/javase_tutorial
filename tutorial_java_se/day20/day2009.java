package day20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//字符数组拷贝 每次读写一个字符数组
public class day2009 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			// 输入流,连接源文件和程序
			//fr = new FileReader("E:/test/test.txt");
			fr = new FileReader("/home/shengzhen/test_javaio_test.txt");
			// 输出流,连接程序和目标文件
			//fw = new FileWriter("E:/test1/test.txt");
			fw = new FileWriter("/home/shengzhen/test_javaio_test_writer.txt");
			char[] chars = new char[4];// 保存读取到的字符
			int len = 0;// 保存实际读取到的字符数
			// read方法尝试读取chars.length个字符,返回实际读到的字符数
			// 如果读到文件的末尾,则返回-1
			while (-1 != (len = fr.read(chars))) {
				// 将字符数组中的字符写入到输出流
				// 第二个参数表示从字符数组的哪个索引处开始取字符
				// 第三个参数表示写多少个字符
				fw.write(chars, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭输入流
				fr.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				// 刷新流
				fw.flush();
				// 关闭输出流
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
