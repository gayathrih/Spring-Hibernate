package app.injectingObjects.usingconstructors;

public class Customer {
	private Integer custId;
	private String custName;
	
	private Product product ;

	public Customer(Integer custId, String custName, Product product) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.product = product;
	}

	public Integer getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public Product getProduct() {
		return product;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName
				+ ", product=" + product + "]";
	}

	
	

}
