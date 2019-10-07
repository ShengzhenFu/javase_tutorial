package day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
 * 使用预处理语句
PreparedStatement可以创建参数化的sql语句,这样的sql语句是预编译的,因此重复执行时效率更高。*/
public class Jdbc3 {
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
		String username = "root";
// 密码
		String password = "root";
		Connection con = null;
		PreparedStatement sta = null;
		try {
// DriverManager.getConnection方法用户获取数据库连接对象
// 由于使用了jdbc-mysql驱动,这里将会得到一个mysql数据库连接对象
			con = DriverManager.getConnection(url, username, password);
// 创建一个PrepareStatement对象,用于执行sql语句
			sta = con.prepareStatement("update stu set age= ? where name= ?");
//设置第一个参数
			sta.setInt(1, 200);
//设置第二个参数
			sta.setString(2, "张三");
//执行更新
			sta.executeUpdate();
			sta.setInt(1, 201);
			sta.setString(2, "李四");
			sta.executeUpdate();
			sta.setInt(1, 202);
			sta.setString(2, "王五");
			sta.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//关闭语句
			try {
				sta.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
//关闭连接
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
