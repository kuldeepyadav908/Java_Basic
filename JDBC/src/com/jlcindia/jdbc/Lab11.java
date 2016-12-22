package com.jlcindia.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab11 {

	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cs = null;
		try{
			int sid = 97;
			con = JDBCUtil.getMySQLConnection();
			//con = JDBCUtil.getOracleConnection();
			cs = con.prepareCall("call updateStudentResult(?)");
			cs.setInt(1, sid);
			cs.execute();
			System.out.println("Procedure Executed successfully");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(cs, con);
		}
	}

}
