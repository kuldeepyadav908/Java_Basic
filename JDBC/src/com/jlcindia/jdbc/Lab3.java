package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab3 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try{
			//con = JDBCUtil.getMySQLConnection();
			con = JDBCUtil.getOracleConnection();
			String sql = "insert into jlcstudent values(98,'vas','vas@ccubes.com',987654)";
			st = con.createStatement();
			int x = st.executeUpdate(sql);
			if(x == 1){
				System.out.println("Record Inserted");
			}
			else{
				System.out.println("Record not Inserted");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(st, con);
		}

	}

}
