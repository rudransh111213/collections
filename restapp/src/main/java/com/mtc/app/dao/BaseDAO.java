package com.mtc.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {

	public Connection getConnection() {
		
		Connection connection = null;
		
		try {
			
			Class.forName("org.gjt.mm.mysql.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "root");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
}
