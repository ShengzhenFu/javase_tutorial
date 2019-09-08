package day20;

import java.io.File;
import java.io.FilenameFilter;
// 文件过滤
public class day2004 {
	public static void main(String[] args) {
		//File file = new File("E:/test1");
		File file = new File("/home/shengzhen/test_javaio");
		if (!file.exists()) {
			// 在磁盘上创建目录
			file.mkdir();
		}
		// 获取目录中的所有文件(包括文件和目录)
		File[] files = file.listFiles(new FilenameFilter() {
			// 返回true代表接受文件,返回false代表不接受文件
			@Override
			public boolean accept(File dir, String name) {
				// dir是文件所在的目录
				// 只接受txt文件
				return name.endsWith(".txt");
			}
		});
		for (File f : files) {
			System.out.println(f.getAbsolutePath());
		}
	}
}
