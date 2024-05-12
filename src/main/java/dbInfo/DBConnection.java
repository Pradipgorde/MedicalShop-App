package dbInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements DBInfo
{
	
	private static Connection con=null;
	
	private DBConnection() 
	{
		
	}
	
	static
	{
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		con = DriverManager.getConnection(url, uname, pass);
					
		}catch(Exception e) {
			
		}
		
	}
	
	
	public static Connection getConnection()  
	{

		return con;
	}
	
	
}
