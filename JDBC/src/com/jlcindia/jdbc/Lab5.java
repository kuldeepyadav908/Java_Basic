package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab5 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try{
			con = JDBCUtil.getMySQLConnection();
			//con = JDBCUtil.getOracleConnection();
			int sid = 107;
			String nm = "Manish";
			String em = "manish@jlc.com";
			long ph = 90567845L;
			String sql = String.format("insert into jlcstudent values(%d,'%s','%s',%d)", sid,nm,em,ph);
			System.out.println(sql);
			st = con.createStatement();
			int x = st.executeUpdate(sql);
			if(x == 1)
				System.out.println("Record Inserted");
			else
				System.out.println("Record not Inserted");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(st, con);
		}

	}

}
