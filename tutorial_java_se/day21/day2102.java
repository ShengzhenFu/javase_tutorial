package day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 编写程序,控制台输入源文件和目标文件的路径,实现任意文件的拷贝。
 * */
public class day2102 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please input source file");
		String src = s.nextLine();
		System.out.println("please input target file");
		String dest = s.nextLine();
		
		File srcFile = new File(src);
		File destFile = new File(dest);
		if (!srcFile.exists()) {
			System.out.println("source file does NOT exist !");
		}else {
			FileInputStream fis = null;
			FileOutputStream fos = null;
			try {
				fis = new FileInputStream(srcFile);
				fos = new FileOutputStream(destFile);
				
				byte[] bs = new byte[256];
				int len = 0;
				while (-1 != (len = fis.read(bs))) {
					fos.write(bs, 0, len);
				}
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					fis.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
				
				try {
					fos.flush();
				}catch (IOException e) {
					e.printStackTrace();
				}
				
				try {
					fos.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
