package app.aop.service;

import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect_3 {
	
	
	
   @Before("execution(public * app.aop.service.TeacherService.getName())")
	public void loggingAdvice_1() {
		System.out.println("Before : log_1");
	}
   
   @After("execution(public * app.aop.service.TeacherService.getName())")
   public void loggingAdvice_2() {
		System.out.println("After : log_2");
	}
   
   @AfterReturning("execution(public * app.aop.service.TeacherService.getName())")
   public void loggingAdvice_3() {
		System.out.println("After Returning : log_3");
	}
   
   @AfterThrowing("execution(public * app.aop.service.TeacherService.getName())")
   public void loggingAdvice_4() {
		System.out.println("After Throwming : log_4");
	}
   
	/*
	 * @Around("execution(public * app.aop.service.TeacherService.getName())")
	 * public void loggingAdvice_5() { System.out.println("Around : log_5"); }
	 */
	
	

}
