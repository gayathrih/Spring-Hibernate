package app.aop.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOP_3 {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext  ctx = new ClassPathXmlApplicationContext("bean-aop-cfg.xml");
		
		 ClassService classObj =  ctx.getBean(ClassService.class);
			    TeacherService teacherSrv= classObj.getTeacherService();
			      teacherSrv.setName("Teacer Name = Smith");
			     
			     teacherSrv.getName();
			     
		      
		ctx.close();
		
	}

}
