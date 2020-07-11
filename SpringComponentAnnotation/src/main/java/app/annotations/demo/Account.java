package app.annotations.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Account {
	
	@Value(value="1111_1111_1111_1111")
	 private String accNo;
	
	@Value(value="Current_Account")
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
