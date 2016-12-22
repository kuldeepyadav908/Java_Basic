package com.jlcindia.jdbc;

import javax.sql.RowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Lab27 {

	public static void main(String[] args) {
		try{
			RowSetFactory factory = RowSetProvider.newFactory();
			RowSet rs = factory.createCachedRowSet();
			rs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
			rs.setUsername("system");
			rs.setPassword("symbian");
			rs.setCommand("select sid,sname,email,phone from jlcstudent");
			rs.execute();
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}