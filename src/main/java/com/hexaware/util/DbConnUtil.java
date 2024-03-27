package com.hexaware.util;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Utility class for managing database connections.
 */

public class DbConnUtil {

	static Connection con;

	public static Connection getDBConn() {
		
		
		 /**
	     * Returns a database connection.
	     * @return the database connection
	     */

		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/virtualartgallery", "root", "mysqljiv");
		} catch (SQLException e) {
	
			e.printStackTrace();
		}

		return con;
	}

	
		
	}



