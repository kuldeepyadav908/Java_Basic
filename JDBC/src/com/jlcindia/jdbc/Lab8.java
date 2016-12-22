package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab8 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = JDBCUtil.getMySQLConnection();
			//con = JDBCUtil.getOracleConnection();
			int sid = 108;
			String nm = "Manish";
			String em = "manish@jlc.com";
			long ph = 90567845L;
			String sql = "insert into jlcstudent values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, sid);
			ps.setString(2, nm);
			ps.setString(3, em);
			ps.setLong(4, ph);
			int x = ps.executeUpdate();
			if(x == 1)
				System.out.println("Record Inserted");
			else
				System.out.println("Record not Inserted");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(ps, con);
		}
	}

}
