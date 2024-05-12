package adminLogin;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminBean implements  Serializable
{
	
	private String uname,password;
	
	public AdminBean() {
		
	}

	public String getName() {
		return uname;
	}

	public void setName(String name) {
		this.uname = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	

}
