package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab16 {

	public static void main(String[] args) {
		Connection con =null;
		Statement st = null;
		ResultSet rs = null;
		try{
			con = JDBCUtil.getMySQLConnection();
			//con = JDBCUtil.getOracleConnection();
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select sid,sname,email,phone from jlcstudent");
			System.out.println("**All Records**");
			while (rs.next()) 
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
				
			System.out.println("**Inserting Records**");
			rs.moveToInsertRow();;
			rs.updateInt(1, 222);
			rs.updateString(2, "DK");
			rs.updateString(3, "dk@cc.com");
			rs.updateLong(4, 12345);
			rs.insertRow();
			
			System.out.println("Record Inserted");
			
			System.out.println("**Updating 1nd Record**");
			rs.absolute(1);
			rs.updateString(2, "Ramesh");
			rs.updateString(3, "ramesh@gm");
			rs.updateLong(4, 76856098);
			rs.updateRow();
			System.out.println("Record Updated");
			System.out.println("**3rd Record Deleted**");
			rs.absolute(3);
			rs.deleteRow();
			System.out.println("Record deleted");
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
