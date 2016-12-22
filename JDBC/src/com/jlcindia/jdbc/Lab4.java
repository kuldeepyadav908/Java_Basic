package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab4 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try{
			con = JDBCUtil.getMySQLConnection();
			//con = JDBCUtil.getOracleConnection();
			String sql = "select* from jlcstudent";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()){
				do{
					int sid = rs.getInt(1);
					String nm = rs.getString(2);
					String em = rs.getString(3);
					long ph = rs.getLong(4);
					System.out.println(sid+"\t"+nm+"\t"+em+"\t"+ph);
				}while(rs.next());
			}else{
				System.out.println("No Record found");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(rs, st, con);
		}
	}
}
