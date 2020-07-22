package app.aop.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOP_3 {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext  ctx = new ClassPathXmlApplicationContext("bean-aop-cfg.xml");
		
		 ClassService classObj =  ctx.getBean(ClassService.class);
		
		    StudentService stuSrv= classObj.getStudentService();
		      stuSrv.setName("Name = Jhon");
		      stuSrv.setCourseName("Course =  JAVA");
			      
			      System.out.println(stuSrv.getName());
			      System.out.println(stuSrv.getCourseName());
			       System.out.println(stuSrv.test());
			       
			       
			     
		      
		ctx.close();
		
	}

}
