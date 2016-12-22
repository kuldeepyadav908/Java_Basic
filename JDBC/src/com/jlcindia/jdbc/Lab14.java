package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab14 {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = JDBCUtil.getMySQLConnection();
			//con = JDBCUtil.getOracleConnection();
			String sql = "insert into jlcstudent(sid,sname) values(?,?)";
			ps = con.prepareStatement(sql);
			Scanner sc = new Scanner(System.in);
			char choice = 'Y';
			do{
				System.out.println("Enter Name");
				String nm = sc.nextLine();
				System.out.println("Enter Id");
				int id = sc.nextInt();
				ps.setInt(1, id);
				ps.setString(2, nm);
				ps.addBatch();
				System.out.println("Do u Want to addMore");
				sc.nextLine();
				choice = sc.nextLine().charAt(0);
			}while(choice == 'Y');
			int res[] = ps.executeBatch();
			for(int i: res)
				System.out.println("Result: "+i);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
