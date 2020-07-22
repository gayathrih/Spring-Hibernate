package app.aop.service;

import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect_4 {
	
	
	
	@Before("execution(public * app.aop.service.*.*(..))")
	public void loggingAdvice_1() {
		System.out.println("loggingAdivce : stu:  logg_1");
	}
   
  
	
	

}
