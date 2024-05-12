package viewAllProduct;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;
import addProduct.*;
@SuppressWarnings("serial")
@WebServlet("/veiw")
public class ViewAllProductServlet  extends HttpServlet
{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		
		HttpSession hs = req.getSession(false);
		
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired...");
			
			RequestDispatcher rd = req.getRequestDispatcher("fail.jsp");
			rd.forward(req, res);
			
		}else
		{
				ArrayList<ProductBean> list = new ViewProductDAO().getProductDetails();
			
			System.out.println(list);
			hs.setAttribute("Pbean", list);
			
			RequestDispatcher rd = req.getRequestDispatcher("viewProduct.jsp");
			rd.forward(req, res);
			
		}
		
		
		
		
	}
	

}
