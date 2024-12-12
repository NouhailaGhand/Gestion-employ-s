package DAO;

import java.sql.*;

public class Connexion {
	
	private static final String URL = "jdbc:mysql://localhost:3308/employe_management";
	private static final String user = "root";
	private static final String password = "";
	static Connection conn = null;
	
	public static Connection getConnection() {
		
		try {
			
			conn = DriverManager.getConnection(URL , user , password);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
