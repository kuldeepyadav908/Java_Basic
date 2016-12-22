package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import com.jlcindia.jdbc.util.JDBCUtil;


public class Lab17 {

	public static void main(String[] args)throws SQLException {
		Connection con = JDBCUtil.getMySQLConnection();
		//Connection con = JDBCUtil.getOracleConnection();
		DatabaseMetaData md = con.getMetaData();
		System.out.println("URL:"+md.getURL());
		System.out.println("User:"+md.getUserName());
		System.out.println("Major Version:"+md.getDatabaseMajorVersion());
		System.out.println("Minor Version:"+md.getDatabaseMinorVersion());
		System.out.println("Full join:"+md.supportsFullOuterJoins());
		System.out.println("Product Name:"+md.getDatabaseProductName());
		System.out.println("Multiple RS:"+md.supportsMultipleOpenResults());
		System.out.println("DB:"+md.getDatabaseProductName());
	}

}
