package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab6 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try{
			con = JDBCUtil.getMySQLConnection();
			//con = JDBCUtil.getOracleConnection();
			int sid = 97;
			String sql = String.format("select* from jlcstudent where sid = %d",sid);
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()){
				int id = rs.getInt(1);
				String nm = rs.getString(2);
				String em = rs.getString(3);
				long ph = rs.getLong(4);
				System.out.println(id+"\t"+nm+"\t"+em+"\t"+ph);
			}else{
				System.out.println("Sorry, Student not found");
			}
	}catch(Exception e){
		e.printStackTrace();
	}finally {
		JDBCUtil.cleanup(rs, st, con);
	}

	}
}