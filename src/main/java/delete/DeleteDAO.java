package delete;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dbInfo.DBConnection;

public class DeleteDAO 
{
	
	private int k=0;
	
	
	public int deleteData(String code)
	{
		
		try {
				
			Connection con = DBConnection.getConnection();
			
			PreparedStatement ps = con.prepareStatement("delete from Product where productCode=?");
			
			ps.setString(1, code);
			
			k = ps.executeUpdate();
			
			
		}catch(Exception e) {}
		
		
		return k;
	}
	
	

}
