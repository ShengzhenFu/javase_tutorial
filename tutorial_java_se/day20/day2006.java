package day20;

import java.io.FileWriter;
import java.io.IOException;
//流实现文件的读写
//FileWriter FileWriter 提供了关于写文件的基本操作
public class day2006 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			// 创建一个输出流,如果文件不存在,就会创建一个文件
			fw = new FileWriter("/home/shengzhen/test_javaio_test.txt");
			// 向流中写
			fw.write("中国你好\n");
			// 刷新流
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭流
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
