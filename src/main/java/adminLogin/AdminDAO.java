package adminLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dbInfo.DBConnection;

public class AdminDAO
{
	AdminBean ab2 = null;
	
	
	public AdminBean getLogin(String name, String pass)
	{
		
		try
		{
			
			Connection con = DBConnection.getConnection();
			
			PreparedStatement ps = con.prepareStatement("select * from Admin where name=? and password=?");
			
			ps.setString(1, name);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				ab2 = new AdminBean();
				
			ab2.setName(rs.getString(1)); ab2.setPassword(rs.getString(2));
		
			
			}
		}catch (Exception e) 
	      	{}
		
		
		return ab2;
		
	}
	
	

}
