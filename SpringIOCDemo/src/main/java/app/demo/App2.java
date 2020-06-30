package app.demo;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	public static void main(String[] args) {
		
		
		ApplicationContext ctx =  new ClassPathXmlApplicationContext("spring-bean-cfg.xml");
		
		// AccountService accService  = new SBIAccountServiceImpl();
		
		AccountService accountService  =ctx.getBean("obj",AccountService.class);
		 accountService.createAccount();
		 accountService.manageAccount();
	}

}
