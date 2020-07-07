package app.autowiring.byConstructor.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client_ByContructor {
	
	 public static void main(String[] args) {
		
		   AbstractApplicationContext ctx  =  new ClassPathXmlApplicationContext("bean-autowiring-constructor-cfg.xml");
		   
		    Book obj =ctx.getBean(Book.class);
		    
		    System.out.println(obj);
		  
		     ctx.close();
	}

}
