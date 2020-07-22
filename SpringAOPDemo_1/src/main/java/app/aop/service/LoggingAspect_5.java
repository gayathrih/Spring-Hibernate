package app.aop.service;

import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect_5 {
	
	
	
	@Before("within(app.aop.service.TeacherService)")
	public void loggingAdvice_1() {
		System.out.println("loggingAdivce : teacher:  logg_1");
	}
   
  
	
	

}
