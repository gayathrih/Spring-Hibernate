package app.annotations.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	
	 public static void main(String[] args) {
		
		  AbstractApplicationContext ctx =  new ClassPathXmlApplicationContext("bean-componentannotation-cfg.xml");
		  
		  Bank obj =ctx.getBean(Bank.class);
		  
		   System.out.println(obj);
		   
		   
		   ctx.close();
	}
}

