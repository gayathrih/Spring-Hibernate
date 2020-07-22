package app.aop.service;

import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect_6 {
	
	
	
	
	/*
	 * @Before("within(public * app.aop.service.*.getName())") public void
	 * loggingAdvice_1() { System.out.println("loggingAdivce : logg_1"); }
	 * 
	 * @Before("within(public * app.aop.service.*.getName()") public void
	 * loggingAdvice_2() { System.out.println("loggingAdivce : logg_2"); }
	 */
	
	
	 @Pointcut("execution(public * app.aop.service.*.getName())")
	 public void allGetName() {}
	 

	 
	 @Before("allGetName()")
	  public void firstlog() {
		  System.out.println("firts_logg_1");
	  }
	 @Before("allGetName()")
	  public void  secondlog() {
		  System.out.println("second_logg_2");
	  }
			 
	
   
  
	
	

}
