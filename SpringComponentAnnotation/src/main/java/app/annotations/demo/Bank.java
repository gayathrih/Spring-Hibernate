package app.annotations.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bank {
	@Value(value="ICICI_Bank")
	private String bankName;
	
	@Value(value="IndiraNagar")
	private String bankAddress;
	
	@Autowired
	private Account account;
	
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Bank Details [\nbankName=" + bankName + 
				      "\nbankAddress=" + bankAddress+
				      account +"]";
	}
	
	
	

}
