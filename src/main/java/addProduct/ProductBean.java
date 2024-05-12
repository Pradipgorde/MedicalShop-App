package addProduct;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductBean implements Serializable
{

	private String productCode, productName;
	private double productRate, productAmount;
	private Integer qty;
	
	
	public ProductBean(){}

	
	

	public Integer getQty() {
		return qty;
	}




	public void setQty(Integer qty) {
		this.qty = qty;
	}




	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getProductRate() {
		return productRate;
	}


	public void setProductRate(double productRate) {
		this.productRate = productRate;
	}


	public double getProductAmount() {
		return productAmount;
	}


	public void setProductAmount(double productAmount) {
		this.productAmount = productAmount;
	}
	
	
	
	
	
}

