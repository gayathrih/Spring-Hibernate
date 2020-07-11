package app.annotations.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

	@Bean(name="bankAppBean")
	public Bank bankBean()
	{
		Bank  bankObj=  new Bank();
		return bankObj;
	}
	
	
	
	@Bean
	public Account accountBean()
	{
		Account accObj =  new Account();
		return accObj;
	}
}
