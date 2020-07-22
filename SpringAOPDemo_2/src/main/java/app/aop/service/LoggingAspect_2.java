package app.aop.service;

import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect_2 {
	
	
	
   @Before("args(name)")
	
	public void loggingAdvice_1(String name) {
		System.out.println("loggingAdivce : logg_of  "+name);
	}
   
  
	
	

}
