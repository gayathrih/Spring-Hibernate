package com.app.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeTestClass {
	
	 public static void main(String[] args) {
		
		  AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean-prototype-cfg.xml");
		   
		  Customer c1= ctx.getBean(Customer.class);
		     c1.setCustId(1);
		     c1.setCustName("Jhon");
		     
		     System.out.println(c1.getCustId()+" "+c1.getCustName());
		  
		  
		  Customer c2= ctx.getBean(Customer.class);
		  System.out.println(c2.getCustId()+" "+c2.getCustName());
		  ctx.close();
		   
	}

}
