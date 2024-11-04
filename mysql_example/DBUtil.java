package sql_assignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class DBUtil{
	
	private static Connection Can;
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="mysql8";
	private static final String DB_URL="jdbc:mysql://localhost:3306/bank13";
	public static Connection getConnection() {
		try {
			Class.forName( DB_DRIVER_CLASS);
			System.out.println("Sucess");
			Can=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
			System.out.println("Connection succesfully");
		}catch(ClassNotFoundException e) {
			System.out.println("error"+e.getMessage());
		}
		catch(SQLException e) {
			System.out.println("error"+e.getMessage());
		}
	
          return Can;
}
}


