package addProduct;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/add")
public class AddProductServlet extends HttpServlet
{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		
	    HttpSession hs = req.getSession(false);
		
		if(hs==null)
		{
			req.setAttribute("msg", "Session expire....");
			RequestDispatcher rd = req.getRequestDispatcher("fail.jsp");
			rd.forward(req, res);
		}else {
			
			PrintWriter pw = res.getWriter();
			
			res.setContentType("text/html");
				
		ProductBean pb = new  ProductBean();
		
		pb.setProductCode(req.getParameter("code")); pb.setProductName(req.getParameter("name"));
		Integer qty = Integer.parseInt(req.getParameter("qty"));
		Double rate = Double.parseDouble(req.getParameter("rate"));
		
		pb.setQty(qty); pb.setProductRate(rate);
		
		double amount= qty*rate;  pb.setProductAmount(amount);
		
			int k = new AddProductDAO().addProduct(pb);
			
			if(k>0) 
			{
				
               req.setAttribute("msg", "Product Added Sucessfully....<br> ");
               RequestDispatcher rd = req.getRequestDispatcher("product.jsp");
               rd.forward(req, res);
               
               
			}
			
			else {
				
				pw.println("<script> window.alert('Wrong Input') </script>      ");
				req.getRequestDispatcher("viewProduct.jsp").include(req, res);
				
				
			}
			
		
			
			
		}
		
		
		
		
		
		
	}
	
	
	

}
