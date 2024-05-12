package updateProduct;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import addProduct.ProductBean;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateServlet2 extends  HttpServlet
{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		
		HttpSession hs = req.getSession(false);
		
		
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired...");
			req.getRequestDispatcher("fail.jsp").forward(req, res);
		}
		else {
			
			System.out.println(" in Update ");
			
			 ProductBean pb = new ProductBean();
			 
			 pb.setProductCode(req.getParameter("code"));
			 pb.setProductName(req.getParameter("name"));
			 Integer qty = Integer.parseInt(req.getParameter("qty"));
			 Double rate = Double.parseDouble(req.getParameter("rate"));
			 
			 Double amount = qty*rate;  
			 
			 pb.setQty(qty); pb.setProductRate(rate); pb.setProductAmount(amount);
			 
			 int k = new UpdateDAO().updateProduct(pb);
			 if(k>0) {
				 
				 req.setAttribute("msg","Product Updated Sucessfully....");
				 req.getRequestDispatcher("updatejsp.jsp").forward(req, res);
				 
			 }else {
				 
				 req.setAttribute("msg", " Product not Updated ....");
				 req.getRequestDispatcher("notUpdate.jsp");
				 
			 }
			 
			 
			
			
		}
		
	}
	

}
