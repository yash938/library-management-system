package com.cruds.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {

	static {
		try {
			// Correct Driver class name
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {

		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb", "root", "ROOT");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
