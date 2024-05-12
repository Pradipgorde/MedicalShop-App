package updateProduct;

import java.sql.Connection;
import java.sql.PreparedStatement;

import addProduct.ProductBean;
import dbInfo.DBConnection;

public class UpdateDAO 
{
	private int k=0;
	
	public int updateProduct(ProductBean pb)
	{
		System.out.println(" In DAO ");
		try {
			
			System.out.println(pb.getProductCode()+" "+pb.getProductName()+" "+pb.getQty()+" "+pb.getProductRate()+" "+pb.getProductAmount());
	
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("update Product set productName=?, productQty=?, productRate=?, productAmount=? where productCode=? ");
			
			
			ps.setString(1, pb.getProductName()); ps.setInt(2, pb.getQty()); ps.setDouble(3, pb.getProductRate());
			ps.setDouble(4, pb.getProductAmount()); ps.setString(5, pb.getProductCode()); 
 			
		    k = ps.executeUpdate();	
			System.out.println("k value:"+k);
			
		}catch(Exception e) {}
		
		
		
		return k;
	}
	
	
	

}
