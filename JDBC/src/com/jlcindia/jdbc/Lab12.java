package com.jlcindia.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab12 {

	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cs = null;
		try{
			int sid = 67;
			con = JDBCUtil.getMySQLConnection();
			//con = JDBCUtil.getOracleConnection();
			cs = con.prepareCall("call updateStudentData(?,?,?,?)");
			//IN Parameter
			cs.setInt(1, sid);
			//OUT Parameter
			cs.registerOutParameter(2, Types.INTEGER);
			cs.registerOutParameter(3, Types.FLOAT);
			cs.registerOutParameter(4, Types.CHAR);
			cs.execute();
			System.out.println("Procedure Executed Successfully");
			//Accessing the value of OUT Parameter
			int total = cs.getInt(2);
			float avg = cs.getFloat(3);
			String grade = cs.getString(4);
			System.out.println("Total: "+total);
			System.out.println("Average: "+avg);
			System.out.println("Grade: "+grade);
		}catch(SQLException e){
			System.out.println("Error in Calling Procedure");
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(cs, con);
		}

	}

}



/*Procedure Executed Successfully
Total: 235
Average: 78.333336
Grade: B
 */
