package day21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class day2106 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		// 过滤流,可以包装一个字节流,获得一个字符流,采用指定的编码方式进行转换
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			fis = new FileInputStream("/home/shengzhen/test_javaio_test_2104.txt");
			// 将字节流以GBK编码转换为字符流
			isr = new InputStreamReader(fis, "GBK");
			// 加缓冲区
			br = new BufferedReader(isr);
			String str = null;
			// br.readLine()方法读取一行,如果到达文件的末尾则返回null
			while (null != (str = br.readLine())) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
