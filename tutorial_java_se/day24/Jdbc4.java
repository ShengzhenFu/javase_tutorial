package day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 处理事务
事务是一个最小的不可再分的工作单元; 通常一个事务对应一个完整的业务,例如银行转账从卡A到卡B。需要扣除
A中的钱,然后将钱加到B中*/
public class Jdbc4 {
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
		Statement sta1 = null;
		Statement sta2 = null;
		try {
// DriverManager.getConnection方法用户获取数据库连接对象
// 由于使用了jdbc-mysql驱动,这里将会得到一个mysql数据库连接对象
			con = DriverManager.getConnection(url, username, password);
// 关闭自动提交,开启事务
			con.setAutoCommit(false);
			System.out.println("开启事务");
// 创建一个Statement对象,用于执行sql语句
			sta1 = con.createStatement();
			sta1.executeUpdate("update account set money = money - 100 where name='A'");
// int a = 0;
// System.out.println(1 / a);
// 创建一个Statement对象,用于执行sql语句
			sta2 = con.createStatement();
			sta2.executeUpdate("update account set money = money + 100 where name='B'");
// 提交事务
			con.commit();
			System.out.println("提交事务");
		} catch (Exception e) {
// 回滚事务
			try {
				con.rollback();
				System.out.println("回滚事务");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
// 关闭语句
			try {
				sta1.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
// 关闭语句
			try {
				sta2.close();
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
