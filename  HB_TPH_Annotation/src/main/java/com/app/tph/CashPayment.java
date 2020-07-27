package com.app.tph;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value="Cash_new _pay")
public class CashPayment extends Payment {
	
	 private Integer receiptNo;

	public Integer getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(Integer receiptNo) {
		this.receiptNo = receiptNo;
	}
	 
	 
	 

}
