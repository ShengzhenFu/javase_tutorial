package day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc5 {
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
			sta = con.prepareStatement("insert into stu(sno, name) values(?,?)");
			for (int i = 0; i < 100; i++) {
				sta.setInt(1, (i + 1));
				sta.setString(2, "张三" + (i + 1));
//将这条语句加入到批处理中
				sta.addBatch();
			}
//执行批处理,将语句同时发送给数据库执行sta.executeBatch();
//清空批处理中的所有语句
			sta.clearBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
