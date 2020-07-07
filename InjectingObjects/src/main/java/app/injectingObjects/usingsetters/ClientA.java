package app.injectingObjects.usingsetters;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientA {
	
	 public static void main(String[] args) {
		
		   AbstractApplicationContext ctx  =  new ClassPathXmlApplicationContext("bean-injectingObject-setter-cfg.xml");
		   
		   Customer c1  = ctx.getBean(Customer.class);
		   
		   /*  System.out.println( c1.getCustId()+" "+c1.getCustName());
		     
		      Product p1=c1.getProduct();
		     
		      System.out.println(p1.getProdId()+" "+p1.getProdName()+" "+p1.getProdPrice());*/
		   
		   
		   System.out.println( c1.getCustId()+" "+c1.getCustName()+" "+c1.getProduct());
		     ctx.close();
	}

}
