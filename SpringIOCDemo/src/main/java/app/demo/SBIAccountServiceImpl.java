package app.demo;

public class SBIAccountServiceImpl implements AccountService{

	@Override
	public void createAccount() {
       System.out.println("SBI create Account method");		
	}

	@Override
	public void manageAccount() {
        System.out.println("SBI Mangae Account method  ");		
	}

}
