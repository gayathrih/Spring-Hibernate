package app.aop.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect_4 {
	
	
	@Pointcut("execution(public * app.aop.service.TeacherService.getName())")
	public void getNamePointcut() {}
	
	
	@Around("getNamePointcut()")
	public void logAdvice(ProceedingJoinPoint joinpoint) {
		
		System.out.println("Before Advice :  log_1 ");
		
		  try {
			joinpoint.proceed();
			
			System.out.println("Afer Advice :  log_2");
			
		} catch (Throwable e) {
			  System.out.println("After Throwing : log_3");
		}
		  
		  
	}
	
   /*@Before("getNamePointcut()")
	public void loggingAdvice_1() {
		System.out.println("Before : log_1");
	}
   
   @After("getNamePointcut()")
   public void loggingAdvice_2() {
		System.out.println("After : log_2");
	}
   
   @AfterReturning("getNamePointcut()")
   public void loggingAdvice_3() {
		System.out.println("After Returning : log_3");
	}
   
   @AfterThrowing("getNamePointcut()")
   public void loggingAdvice_4() {
		System.out.println("After Throwming : log_4");
	}*/
   
	
	
	

}
