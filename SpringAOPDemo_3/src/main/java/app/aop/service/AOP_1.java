package app.aop.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOP_1 {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext  ctx = new ClassPathXmlApplicationContext("bean-aop-cfg.xml");
		
		 ClassService classObj =  ctx.getBean(ClassService.class);
		
		    StudentService stuSrv= classObj.getStudentService();
		      stuSrv.setName("stu Name = Jhon");
		     
			      
			      System.out.println(stuSrv.getName());
			    
		      
		ctx.close();
		
	}

}
