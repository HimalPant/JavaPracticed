package com.test.swingdemo.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class db {
	public static Connection getDbcon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
