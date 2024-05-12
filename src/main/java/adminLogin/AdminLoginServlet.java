package adminLogin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/adminlog")
public class AdminLoginServlet extends HttpServlet
{
	
	
	//@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		
		String name = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		AdminBean ab1 = new AdminDAO().getLogin(name,pass);
		
		if(ab1==null)
		{
				
				//req.setAttribute("msg", "Login Fail....");
				
				RequestDispatcher rd = req.getRequestDispatcher("fail.jsp");
				rd.forward(req, res);
				
				
		
			
		} 
	else	
		{ 
			
			HttpSession hs = req.getSession();
			
			hs.setAttribute("adminlogin", ab1);
				
			req.setAttribute("msg", "Login Sucessfully...");
			RequestDispatcher rd = req.getRequestDispatcher("adminLogin.jsp");
			rd.forward(req, res);
			
			
		}
		
		
		
	}
	

	
}
