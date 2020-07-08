package app.autowire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	  public static void main(String[] args) {
		
		    AbstractApplicationContext ctx =  new ClassPathXmlApplicationContext("bean-resource-annotation.xml");
		    
		     Customer custObj = ctx.getBean(Customer.class);
		     
		     System.out.println(custObj);
		     
		     ctx.close();
	}

}
