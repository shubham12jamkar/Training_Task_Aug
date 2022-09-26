package com.yash.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	public Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dynamicprepared","root","root");
		return con;
		
	}

}
