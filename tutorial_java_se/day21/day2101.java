package day21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 编写程序,在/盘创建一个目录home,再创建一个子目录Shengzhen,在Shengzhen中创建一个文件test_javaio_test.txt,使用输出流将往
test_javaio_test.txt中写一个字符串,然后再使用输入流,将test_javaio_test.txt中的文本读到程序中。
 */
public class day2101 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("/home/shengzhen/test_javaio_test.txt");
			fw.write("i love you China, happy 70th birthday\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				fw.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileReader fr = null;
		try {
			fr = new FileReader("/home/shengzhen/test_javaio_test.txt");
			int c = 0;
			while (-1 != (c = fr.read())) {
				System.out.print((char)c);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
