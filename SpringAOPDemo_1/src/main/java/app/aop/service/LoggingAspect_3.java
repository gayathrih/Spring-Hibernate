package app.aop.service;

import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect_3 {
	
	
	
	/* @Before("execution(public String app.aop.service.StudentService.*())") */
	
	@Before("execution(public * app.aop.service.StudentService.*(..))")
	
	public void loggingAdvice_1() {
		System.out.println("loggingAdivce : stu:  logg_1");
	}
   
  
	
	

}
