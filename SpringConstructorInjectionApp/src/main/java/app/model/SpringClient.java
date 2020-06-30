package app.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {
	
	public static void main(String[] args) {
		
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("Bean-cfg.xml");
		 
		  Book obj=(Book)ctx.getBean("b1");
		  
		  Book obj2=(Book)ctx.getBean("b2");
		  
		  System.out.println(obj);
		  System.out.println(obj2);
	}

}
