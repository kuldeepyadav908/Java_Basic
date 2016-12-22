package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab13 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try{
			con = JDBCUtil.getMySQLConnection();
			//con = JDBCUtil.getOracleConnection();
			st = con.createStatement();
			String sql1 = "insert into jlcStudent values(95,'Sree','Sri@jl.com',989898)";
			st.addBatch(sql1);
			String sql2 = "insert into jlcStudent values(92,'Dande','dd@jlc.com',3455667)";
			st.addBatch(sql2);
			String sql3 = "insert into jlcStudent values(88,'DD','Dande@cc',9899999)";
			st.addBatch(sql3);
			String sql4 = "insert into jlcStudent values(89,'VAS','vas@cc.com',7777789898)";
			st.addBatch(sql4);
			String sql5 = "insert into jlcStudent values(78,'Srinivas','Sriva@cc',777777)";
			st.addBatch(sql5);
			String sql6 = "insert into jlcStudent values(80,'Nivas','nivas@jlc',98555555)";
			st.addBatch(sql6);
			int x[] = st.executeBatch();
			for(int i = 0;i<x.length;i++){
				System.out.println(x[i]);
			}
			System.out.println("inserted Batch");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(st, con);
		}
	}

}



/*
1
1
1
1
1
1
inserted Batch
*/