package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Lab1 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try{
			//step 1: Load the Driver class
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//step 2: Establish Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/saket","root","symbian");
			//con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","symbian");
			//step 3: Prepaire the SQL statement
			String sql = "insert into jlcstudent values(102,'Dande','dande@jlc.com',111111)";
			//step 4: Create the JDBC statement
			st = con.createStatement();
			//step 5: Submit the SQL Statement to Database using JDBC statement.
			int x = st.executeUpdate(sql);
			//step 6: Process the Result.
			if(x==1)
				System.out.println("Record inserted");
			else
				System.out.println("Record not inserted");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			//Step 7: Close all the Resources.
			try{
				if(st != null)
					st.close();
				if(con != null)
					con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}

}
