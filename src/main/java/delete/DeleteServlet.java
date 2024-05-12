package delete;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import addProduct.ProductBean;


@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);
		
		
		
		
		if(hs==null)
		{
			req.setAttribute("msg", " Session expired....");
			
			RequestDispatcher rd = req.getRequestDispatcher("fail.jsp");
			rd.forward(req, res);
			
		}
		else {
			
			
			System.out.println("outside of tru");
			
		
			
			RequestDispatcher rd = req.getRequestDispatcher("delete.jsp");
			rd.forward(req, res);	
			
		
		
		
		
	}
	
	
	
	}
}
