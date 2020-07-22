package app.aop.service;

import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect_1 {
	
	
	
   @Before("args(String)")
	
	public void loggingAdvice_1() {
		System.out.println("loggingAdivce : log_1");
	}
   
  
	
	

}
