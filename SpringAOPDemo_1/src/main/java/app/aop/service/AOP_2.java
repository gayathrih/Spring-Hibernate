package app.aop.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOP_2 {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext  ctx = new ClassPathXmlApplicationContext("bean-aop-cfg.xml");
		
		 ClassService classObj =  ctx.getBean(ClassService.class);
		
		    StudentService stuSrv= classObj.getStudentService();
		      stuSrv.setName("stu Name = Jhon");

			    TeacherService teacherSrv= classObj.getTeacherService();
			      teacherSrv.setName("Teacer Name = Smith");
			      
			      
			      System.out.println(stuSrv.getName());
			      System.out.println(teacherSrv.getName());
		      
		ctx.close();
		
	}

}
