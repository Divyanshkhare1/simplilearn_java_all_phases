package com.simplilearn.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getDBConnection() {

		// step1 Register Driver

		Connection conn = null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// step2 Get DB Connection

	conn	= DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasis", "root", "Divyansh1!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return conn;
	}

}