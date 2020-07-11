package app.annotations.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Account {
	
    @Value(value="1234")
	 private String accNo;
	
	@Value(value="savings account")
	 private String accType;
	 
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	@Override
	public String toString() {
		return " \naccNo=" + accNo + "\n accType=" + accType + "";
	}
	 
	 
	 
	 

}
