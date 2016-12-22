package com.jlcindia.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException ex){
			System.out.println(ex);
		}
	}
	public static Connection getOracleConnection() throws SQLException{
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection con = DriverManager.getConnection(url,"system","symbian");
		return con;
	}
	public static Connection getMySQLConnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/saket";
		Connection con = DriverManager.getConnection(url,"root","symbian");
		return con;
	}
	public static void cleanup(Statement st,Connection con){
		try{
			if(st != null)
				st.close();
			if(con != null)
				con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void cleanup(ResultSet rs,Statement st,Connection con){
		try{
			if(rs != null)
				rs.close();
			if(st != null)
				st.close();
			if(con != null)
				con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}