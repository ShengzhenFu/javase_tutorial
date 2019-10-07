package day26;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;


//作业: 使用jdbc增删改查stu表中的数据。
public class day2601 {
	public static void add(Connection con) {
		Statement sta = null;
		try {
			sta = (Statement) con.createStatement();
			sta.executeUpdate("insert into stu values(200, '200',200,'男', 1)");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				sta.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void update(Connection con) {
		Statement sta = null;
		try {
			sta = con.createStatement();
			sta.executeUpdate("update stu set gender='女' where sno=200");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				sta.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void delete(Connection con) {
		Statement sta = null;
		try {
			sta = con.createStatement();
			sta.executeUpdate("delete from stu where sno=200");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				sta.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void select(Connection con) {
		Statement sta = null;
		ResultSet rs = null;
		try {
			sta = con.createStatement();
			rs = sta.executeQuery("select * from stu where sno = 1");
			rs.next();
			System.out.println(rs.getInt(1));// sno
			System.out.println(rs.getString(2));// name
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				sta.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/test?characterEncoding=utf-8";
		String username = "root";
		String password = "root";
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			// add(con);
			// update(con);
			// delete(con);
			select(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
