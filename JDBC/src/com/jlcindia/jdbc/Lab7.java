package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab7 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try{
			con = JDBCUtil.getMySQLConnection();
			//con = JDBCUtil.getOracleConnection();
			String qry = null;
			//qry = "insert into jlcstudent values(96,'Dande','dande@jlc',987650)";
			qry = "select* from jlcstudent";
			//qry = "update jlcstudent set phone = 903178";
			st = con.createStatement();
			boolean b1 = st.execute(qry);
			if(b1)
				rs = st.getResultSet();
			if(rs.next()){
				do{
					int sid = rs.getInt(1);
					String nm = rs.getString(2);
					String em = rs.getString(3);
					long ph = rs.getLong(4);
					System.out.println(sid+"\t"+nm+"\t"+em+"\t"+ph);
				}while(rs.next());
			}else{
				int x = st.getUpdateCount();
				System.out.println("Result: "+x);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(rs, st, con);
		}
	}

}
