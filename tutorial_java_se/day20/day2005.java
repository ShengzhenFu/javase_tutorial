package day20;

import java.io.File;
import java.io.FileFilter;

public class day2005 {
	public static void main(String[] args) {
		//File file = new File("E:/test1");
		File file = new File("/home/shengzhen/test_javaio");
		if (!file.exists()) {
		// 在磁盘上创建目录
		file.mkdir();
		}

	// 获取目录中的所有文件(包括文件和目录)
		File[] files = file.listFiles(new FileFilter() {
	// 返回true代表接受文件,返回false代表不接受文件
	@Override
	public boolean accept(File f) {
		// 只接受10个字节以上的文件
		return f.length() >= 10;
	}});for(

	File f:files)
	{
		System.out.println(f.getAbsolutePath());
	}
}}
