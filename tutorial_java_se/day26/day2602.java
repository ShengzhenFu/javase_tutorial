package day26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
 * 写Lob
数据库的列类型blob对应longblob,Clob对应longtxt*/
public class day2602 {
	public static void main(String[] args) {
// 加载驱动类
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		PreparedStatement ps = null;
		FileInputStream fis = null;
		FileInputStream fis1 = null;
		try {
			fis = new FileInputStream("e:/test/abc/abc.PNG");
			fis1 = new FileInputStream("e:/test/abc/abc.txt");
			String url = "jdbc:mysql://localhost:3306/test?characterEncoding=utf-8";
			String userName = "root";
			String password = "root";
			con = DriverManager.getConnection(url, userName, password);
			ps = con.prepareStatement("insert into stu values(?,?,?,?,?,?,?)");
			ps.setInt(1, 300);
			ps.setString(2, "300");
			ps.setInt(3, 300);
			ps.setString(4, "男");
			ps.setInt(5, 1);
// 设置输入流
// 上传二进制数据
			ps.setBinaryStream(6, fis);
// 上传大文本
			ps.setAsciiStream(7, fis1);
			ps.executeUpdate();
		} catch (SQLException | FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				fis1.close();
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