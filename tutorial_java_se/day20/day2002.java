package day20;

import java.io.File;
import java.io.IOException;
//creat file /home/shengzhen/test_javaio.txt in linux
//java.io.File类的对象代表一个文件或者目录,File类提供了对文件或目录的所有操作。
public class day2002 {
	public static void main(String[] args) throws IOException {
		//file对象代表一个文件,并不是真正的在磁盘上创建文件
		//		File file = new File("E:/test/test.txt");
		File file = new File("/home/shengzhen/test_javaio.txt");
		//检查一个文件或目录是否存在
		System.out.println(file.exists());
		//如果文件不存在就创建并返回true,否则不创建并返回false,是真正的创建文件
		System.out.println(file.createNewFile());
		//获取文件或目录的名称
		System.out.println(file.getName());//test.txt
		//获取文件或目录的路径
		System.out.println(file.getAbsolutePath());//E:\test\test.txt
		//返回代表其父目录的文件对象
		System.out.println(file.getParentFile());
		//返回代表其父目录的文件对象
		File parent = file.getParentFile();
		System.out.println(parent.getName());//获取名称
		//获取文件的大小,以字节为单位
		System.out.println(file.length());
		//判断此对象是否代表一个文件
		System.out.println(file.isFile());
		//判断此对象是否代表一个目录
		System.out.println(parent.isDirectory());
		//是否是隐藏文件
		System.out.println(file.isHidden());
		//是否可读
		System.out.println(file.canRead());
		//是否可写
		System.out.println(file.canWrite());
		//重命名文件
		//
		System.out.println(file.renameTo(new File("/home/shengzhen/test_javaio.txt")));
		//删除文件
		System.out.println(file.delete());
		}
}
