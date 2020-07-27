package com.app.model;

import java.util.List;
import java.util.Set;

public class Customer {
	private   Integer  custId;
	private String custName;
	
	//collection 
	private List<Product> prodSet;

	public Customer(Integer custId, String custName, List<Product> prodSet) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.prodSet = prodSet;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public List<Product> getProdSet() {
		return prodSet;
	}

	public void setProdSet(List<Product> prodSet) {
		this.prodSet = prodSet;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName
				+ ", prodSet=" + prodSet + "]";
	}
	
	
	
	

}
