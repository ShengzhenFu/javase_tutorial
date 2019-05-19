package day25;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class jdbc {
	public void QueryArea(){
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	String url = "jdbc:mysql://localhost:3306/mysiteforme?characterEncoding=utf8&amp;useSSL=true";
    	String username = "root";
    	String password = "root";
    	
    	java.sql.Connection conn = null;
    	PreparedStatement stmt = null;
    	ResultSet rs = null;
    	String sql = "select * from hat_area limit 2";
    	
    	try {
    		System.out.println("connecting to mysql database driver...");
    	conn = DriverManager.getConnection(url, username, password);
    	stmt = conn.prepareStatement(sql);
    	rs = stmt.executeQuery(sql);
    	
    	while(rs.next()) {
    		int id = rs.getInt("id");
    		String areaid = rs.getString("areaID");
    		String area = rs.getString("area");
    		String father = rs.getString("father");
    		
    		System.out.println(id);
    		System.out.println(areaid);
    		System.out.println(area);
    		System.out.println(father);
    		
    	}
    	}catch (SQLException e) {
    		e.printStackTrace();
	}finally {
		if (rs != null) {
		    try { 
			rs.close();
		    }catch(SQLException e){
		    	e.printStackTrace();
		    }
		}
		if(stmt != null) {
			try {
			stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
			conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		}
    	System.out.println("GoodBye !");
	}
	
    public static void main(String[] args) {
    	jdbc q = new jdbc();
    	q.QueryArea();
	}
    	
}
