package app.injectingObjects.usingconstructors;

public class Product {
	private Integer prodId;
	private String prodName;
	private Float prodPrice;
	
	
	
	
	public Product(Integer prodId, String prodName, Float prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}




	public Integer getProdId() {
		return prodId;
	}




	public String getProdName() {
		return prodName;
	}




	public Float getProdPrice() {
		return prodPrice;
	}




	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName
				+ ", prodPrice=" + prodPrice + "]";
	}
	
	

}
