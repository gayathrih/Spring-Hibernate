package app.injectingObjects.usingconstructors;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientB {
	
	 public static void main(String[] args) {
		
		   AbstractApplicationContext ctx  =  new ClassPathXmlApplicationContext("bean-injectingObject-costructor-cfg.xml");
		   
		   Customer c1  = ctx.getBean(Customer.class);
		   
		  System.out.println(c1);
		     ctx.close();
	}

}
