package app.aop.service;

import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {
	
	/*
	 * @Before("execution(public String getName())")
	 * 
	 * public void loggingAdvice_1() {
	 * System.out.println("loggingAdivce : logg_INFO_1"); }
	 * 
	 * @Before("execution(public String getName())") public void loggingAdvice_2() {
	 * System.out.println("loggingAdivce : logg_INFO_2"); }
	 */
	
   @Before("execution(public String getCourseName())")
	
	public void loggingAdvice_1() {
		System.out.println("loggingAdivce : logg_INFO_11");
	}
   
   @Before("execution(public String getName())")
	
	public void loggingAdvice_2() {
		System.out.println("loggingAdivce : logg_INFO_22");
	}
	
	

}
