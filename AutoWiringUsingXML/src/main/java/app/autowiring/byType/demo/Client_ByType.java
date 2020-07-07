package app.autowiring.byType.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client_ByType {
	
	 public static void main(String[] args) {
		
		   AbstractApplicationContext ctx  =  new ClassPathXmlApplicationContext("bean-autowire-byType-cfg.xml");
		   
		    Book obj =ctx.getBean(Book.class);
		    
		    System.out.println(obj);
		  
		     ctx.close();
	}

}
