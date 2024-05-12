package viewAllProduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import addProduct.ProductBean;
import dbInfo.DBConnection;

public class ViewProductDAO 
{
	ArrayList<ProductBean> list = new ArrayList<ProductBean>();
	
	public ArrayList<ProductBean> getProductDetails() 
	{
		
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from product");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				ProductBean pb = new ProductBean();
				
				pb.setProductCode(rs.getString(1));	pb.setProductName(rs.getString(2));
				pb.setQty(rs.getInt(3)); pb.setProductRate(rs.getDouble(4)); pb.setProductAmount(rs.getDouble(5));
				
				list.add(pb);
				
				
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
		
	}
	

}
