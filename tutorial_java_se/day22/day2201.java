package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class day2201 {
	public static void main(String[] args) {
		String readCharset = null;
		String writeCharset = null;
		String readFilePath = null;
		String writeFilePath = null;
		InputStream is = day2201.class.getResourceAsStream("/file.properties");
		Properties props = new Properties();
		try {
			props.load(is);
			readCharset = props.getProperty("readCharset");
			writeCharset = props.getProperty("writeCharset");
			readFilePath = props.getProperty("readFilePath");
			writeFilePath = props.getProperty("writeFilePath");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		try {
			isr = new InputStreamReader(new FileInputStream(readFilePath), readCharset);
			osw = new OutputStreamWriter(new FileOutputStream(writeFilePath), writeCharset);
			char[] chars = new char[256];
			int len = 0;
			while (-1 != (len = isr.read(chars))) {
				osw.write(chars, 0, len);
			}
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				osw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				osw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
