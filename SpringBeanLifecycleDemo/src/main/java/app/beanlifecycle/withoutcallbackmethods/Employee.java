package app.beanlifecycle.withoutcallbackmethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee {
	private String empname;
	private String empaddress;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	
	
	public void initBean(){
		System.out.println("Employee....initlization...");
	}
	
	public void destroyBean(){
		System.out.println("Employee...destroy.....");
	}

}
