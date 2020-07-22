package app.aop.service;

import org.aspectj.lang.annotation.*;


public class LoggingAspect_1 {
	
	public void logBeforeAdvice() {
		System.out.println("logging Before Adivce : log_1");
	}
	
	public void logAfterAdvice() {
		System.out.println("logging After Adivce : log_1");
	}
	
	
	public void logAfterReturingAdvice() {
		System.out.println("logging After_Returning Adivce : log_1");
	}
   
  
	
	

}
