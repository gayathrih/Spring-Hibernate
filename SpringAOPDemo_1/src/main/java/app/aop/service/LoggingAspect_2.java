package app.aop.service;

import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect_2 {
	
	
	
   @Before("execution(public String app.aop.service.StudentService.getName())")
	
	public void loggingAdvice_1() {
		System.out.println("loggingAdivce : stu:  logg_1");
	}
   
   @Before("execution(public String app.aop.service.TeacherService.getName())")
	
	public void loggingAdvice_2() {
		System.out.println("loggingAdivce :teacher :  logg_1");
	}
	
	

}
