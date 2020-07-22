package app.aop.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOP_2 {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext  ctx = new ClassPathXmlApplicationContext("bean-aop-cfg.xml");
		
		 ClassService classObj =  ctx.getBean(ClassService.class);
		
		    StudentService stuSrv= classObj.getStudentService();
		      stuSrv.setName("stu Name = Jhon");
		      stuSrv.setCourseName("Stu : JAVA");

			    TeacherService teacherSrv= classObj.getTeacherService();
			      teacherSrv.setName("Teacer Name = Smith");
			      teacherSrv.setCourseName("Teacher : DBMS");
			     
		      
		ctx.close();
		
	}

}
