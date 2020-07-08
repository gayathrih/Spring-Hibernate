package app.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;


import javax.annotation.*;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	private String custName;
	private String custAddress;
	
	/*@Autowired
	@Qualifier(value="product2") - autowire ="byType"*/
	
	//JSR-250 Java Specification Request
	@Resource(name="product2")
	private Product product;
	
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", custAddress="
				+ custAddress + ", product=" + product + "]";
	}
	
	
	

}
