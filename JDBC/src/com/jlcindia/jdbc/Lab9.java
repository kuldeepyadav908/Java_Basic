package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab9 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = JDBCUtil.getMySQLConnection();
			//con = JDBCUtil.getOracleConnection();
			int sid = 97;
			String sql = "select* from jlcstudent where sid = ?";
			//System.out.println(sql);
			ps = con.prepareStatement(sql);
			ps.setInt(1, sid);
			rs = ps.executeQuery();
			if(rs.next()){
				String nm = rs.getString(2);
				String em= rs.getString(3);
				long ph = rs.getLong(4);
				System.out.println(sid+"\t"+nm+"\t"+em+"\t"+ph);
			}else{
				System.out.println("Sorry, Student not Found");
			}
				
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(rs, ps, con);
		}

	}

}
