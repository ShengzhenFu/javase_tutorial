package day20;

import java.io.File;
// create folder /home/shengzhen/test_javaio in linux
public class day2003 {
	public static void main(String[] args) {
		File file = new File("/home/shengzhen/test_javaio");
		if (!file.exists()) {
			// 在磁盘上创建目录
			file.mkdir();
		}
		// 获取目录中的所有文件
		File[] files = file.listFiles();
		for (File f : files) {
			System.out.println(f.getAbsolutePath());
		}
	}
}
