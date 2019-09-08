package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//字节流和字符流拷贝 字节流每次读写一个字节,字符流每次读写一个字符。 字节流可以读写任何文件,字符流只能
//读写文本文件。 字节流继承于InputStream和OutputStream 字符流继承于Reader和Writer 凡是带Stream的都是字
//节流,否则就是字符流 如果要读写二进制文件,就使用字节流。 如果要读写文本文件,并且需要在程序中查看其内
//容,就使用字符流
public class day2010 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("E:/test/1.PNG");
			fos = new FileOutputStream("E:/test1/1.PNG");
			byte[] bs = new byte[256];// 保存每次读到的字节
			int len = 0;// 保存实际读到的字节数
			while (-1 != (len = fis.read(bs))) {
				fos.write(bs, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fos.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
