package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab26 {

	public static void main(String[] args) {
		//String url = "jdbc:mysql://localhost:3306/saket";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String Uname = "system";
		String Pword = "symbian";
		try(Connection con = DriverManager.getConnection(url,Uname,Pword);
				Statement st = con.createStatement();ResultSet rs = st.executeQuery("select* from jlcstudent");){
			while (rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
				
			}
			}catch(Exception e){
				e.printStackTrace();
		}

	}
}
