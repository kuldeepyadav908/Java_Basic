package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab2 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/saket","root","symbian");
			String sql = "select* from jlcStudent where phone = 888888";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				int sid = rs.getInt(1);
				String sn = rs.getString(2);
				String em = rs.getString(3);
				long ph = rs.getLong(4);
				System.out.println(sid+"\t"+sn+"\t"+em+"\t"+ph);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try{
				if(st != null)
					st.close();
				if(con != null)
					con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}

}
