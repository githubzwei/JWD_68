package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
public static void main(String[] args) {
	System.out.println("DBConnection Test");
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jwd68","root","root");
		System.out.println("con : "+con);
	} catch (ClassNotFoundException e) {
		System.out.println("Driver error : "+e.getMessage());
	} catch (SQLException e) {
		System.out.println("Connection error : "+e.getMessage());
	}
}
}
