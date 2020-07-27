package com.app.model;

import java.util.Set;

public class Customer {
	private   Integer  custId;
	private String custName;
	
	//collection 
	private Set<Product> prodSet;
	
	
	public Customer(Integer custId, String custName, Set<Product> prodSet) {
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
	public Set<Product> getProdSet() {
		return prodSet;
	}
	public void setProdSet(Set<Product> prodSet) {
		this.prodSet = prodSet;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName
				+ ", prodSet=" + prodSet + "]";
	}
	
	
	
	

}
