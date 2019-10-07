package day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2 {
	public static void main(String[] args) {
// 加载驱动类
// Class.forName用于加载指定的类
// 访问不同类型的数据库需要加载不同的驱动类
// com.mysql.jdbc.Driver是访问mysql需要加载的类
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
// 数据库连接url,用于配置参数:主机名,端口,数据的名称,编码格式
		String url = "jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8";
// 用户名
		String username = "root";// 密码
		String password = "root";
		Connection con = null;
		Statement sta = null;
		ResultSet rs = null;
		try {
// DriverManager.getConnection方法用户获取数据库连接对象
// 由于使用了jdbc-mysql驱动,这里将会得到一个mysql数据库连接对象
			con = DriverManager.getConnection(url, username, password);
// 创建一个Statement对象,用于执行sql语句
			sta = con.createStatement();
// 执行查询语句,返回一个结果集
			rs = sta.executeQuery("select * from stu");
// 遍历结果集
// next方法将指针指向结果集中的下一行,如果没有下一行,就返回false
			while (rs.next()) {
// sno
				System.out.println(rs.getInt(1));
// name
				System.out.println(rs.getString(2));
// age
				System.out.println(rs.getInt("age"));
// gender
				System.out.println(rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
// 关闭结果集
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
// 关闭语句
			try {
				sta.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
// 关闭连接
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}