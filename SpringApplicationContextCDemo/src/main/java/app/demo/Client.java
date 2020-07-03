package app.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {
	
	 public static void main(String[] args) {
		
		  AbstractApplicationContext ctx =  new FileSystemXmlApplicationContext("D:\\spring_cfg\\spring-bean-cfg.xml");
		    
		     Customer c1 = ctx.getBean(Customer.class);
		     
		     System.out.println(c1);
		   ctx.close();
		    
	}

}
