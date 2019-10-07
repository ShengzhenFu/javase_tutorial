package day26;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 读Lob
*/
public class day2603 {
	public static void main(String[] args) {
// 加载驱动类
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		Statement ps = null;
		ResultSet rs = null;
		FileOutputStream fos1 = null;
		FileOutputStream fos2 = null;
		InputStream is1 = null;
		InputStream is2 = null;
		try {
			fos1 = new FileOutputStream("e:/test/abc/abc1.PNG");
			fos2 = new FileOutputStream("e:/test/abc/abc1.txt");
			String url = "jdbc:mysql://localhost:3306/test?characterEncoding=utf-8";
			String userName = "root";
			String password = "root";
			con = DriverManager.getConnection(url, userName, password);
			ps = con.createStatement();
			rs = ps.executeQuery("select * from stu where sno = 300");
			rs.next();
// 获得二进制输入流
			is1 = rs.getBinaryStream(6);
// 获取大本文输入流
			is2 = rs.getAsciiStream(7);
// 写二进制文件
			int b = 0;
			while (-1 != (b = is1.read())) {
				fos1.write(b);
			}
// 写大文本文件
			while (-1 != (b = is2.read())) {
				fos2.write(b);
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is1.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			try {
				is2.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				fos1.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				fos2.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
// 关闭连接
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
