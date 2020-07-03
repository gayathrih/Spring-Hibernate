package app.beanlifecycle.usingcallbackmethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientA {
	
	 public static void main(String[] args) {
		
		   ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext("bean-usingcallbacks-cfg.xml");
		    
		    Employee emp = ctx.getBean(Employee.class);
		   
		      System.out.println(emp.getEmpname()+" "+emp.getEmpaddress());
		   ctx.close();
		    
	}

}
