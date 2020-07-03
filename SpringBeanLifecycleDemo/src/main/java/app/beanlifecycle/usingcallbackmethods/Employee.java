package app.beanlifecycle.usingcallbackmethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean ,DisposableBean{
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
	@Override
	public void afterPropertiesSet() throws Exception {
        System.out.println("bean initilization....");	
          System.out.println("connectiing to db...");
	}
	@Override
	public void destroy() throws Exception {
		
		System.out.println("disconnecting to Database..!");
	}
	
	
	

}
