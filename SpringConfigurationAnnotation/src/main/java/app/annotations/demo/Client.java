package app.annotations.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	
	 public static void main(String[] args) {
		
		ApplicationContext ctx =  new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
		  
		 /*Account  accObj =ctx.getBean("accountBean",Account.class);
		   accObj.setAccNo("1234_124_1234_1234");
		   accObj.setAccType("Join_Account");*/
		
		   Bank bankObj =ctx.getBean("bankAppBean",Bank.class);
		     /* bankObj.setBankName("SBI Bank");
		      bankObj.setBankAddress("Domular");
		      bankObj.setAccount(accObj);*/
		      
		   System.out.println(bankObj);   
				   
				  
	}
}

