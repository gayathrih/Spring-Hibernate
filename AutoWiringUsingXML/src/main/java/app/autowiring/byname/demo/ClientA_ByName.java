package app.autowiring.byname.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientA_ByName {
	
	 public static void main(String[] args) {
		
		   AbstractApplicationContext ctx  =  new ClassPathXmlApplicationContext("bean-autowiring-byName-cfg.xml");
		   
		    Book obj =ctx.getBean(Book.class);
		    
		    System.out.println(obj);
		  
		     ctx.close();
	}

}
