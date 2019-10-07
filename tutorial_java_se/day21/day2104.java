package day21;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class day2104 {
	public static void main(String[] args) {
		//获取默认字符集
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.name());
		BufferedWriter br = null;
		try {
			br = new BufferedWriter(new FileWriter("/home/shengzhen/test_javaio_test_2104.txt"));
			br.write("中国你好\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
