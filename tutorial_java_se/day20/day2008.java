package day20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//流实现文件的拷贝, 单字符拷贝 每次读写一个字符
public class day2008 {
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
			int c = 0;// 保存每次读到的字符
			// read方法每次从输入流读取一个字符
			// 如果read方法读到文件的末尾,那么它就返回-1
			while (-1 != (c = fr.read())) {
				// 每次向输出流写入一个字符
				fw.write(c);
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
			try {// 刷新流
				fw.flush();
				// 关闭输出流
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
