package app.beanlifecycle.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientC {
	
	 public static void main(String[] args) {
		
		   ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext("bean-annotation-cfg.xml");
		    
		    Employee emp = ctx.getBean(Employee.class);
		   
		      System.out.println(emp.getEmpname()+" "+emp.getEmpaddress());
		      
		     Book obj = ctx.getBean("b1" , Book.class);
		       System.out.println(obj);
		   ctx.close();
		    
	}

}
