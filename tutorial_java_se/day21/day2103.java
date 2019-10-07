package day21;
/*
 * 节点流 FileReader:以字符读文件 FileWriter:以字符写文件 FileInputStream:以字节读文件 FileOutputStream:
以字节写文件 CharArrayReader:以字符读字符数组 CharArrayWriter:以字符写字符数组 StringReader:以字符
读字符串 StringWriter:以字符写字符串 ByteArrayInputStream:以字节读字节数组 ByteArrayOutputStream:以
字节写字节数组
过滤流 BufferedReader:以字符读缓冲区
BufferedWriter:以字符写缓冲区 BufferedInputStream:字节读缓冲区 BufferedOutputStream:字节写缓冲区
InputStreamReader:字节输入流转换为字符输入流 OutputStreamWriter:字符输出流转换为字节输出流
ObjectInputStream:以字节读对象 ObjectOutputStream:以字节写对象
 * */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class day2103 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("/home/shengzhen/test_javaio_test_2103.txt");
			// 将fr包装为一个缓冲过滤流
			// 缓冲过滤流内部有一个缓冲区,可以提高IO效率
			// 装饰者模式br = new BufferedReader(fr);// 过滤流连接节点流
			int c = 0;
			while (-1 != (c = br.read())) {
				System.out.print((char) c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 只需要关闭最外层的流
			// 外层流关闭时会关闭内层流
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
