package app.injectingObjects.usingsetters;

public class Product {
	private Integer prodId;
	private String prodName;
	private Float prodPrice;
	
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName
				+ ", prodPrice=" + prodPrice + "]";
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Float getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(Float prodPrice) {
		this.prodPrice = prodPrice;
	}
	
	
	

}
