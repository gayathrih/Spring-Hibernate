package app.demo;

public class UnionAccountServiceImpl implements AccountService {
	@Override
	public void createAccount() {
       System.out.println("Union create Account method");		
	}

	@Override
	public void manageAccount() {
        System.out.println("Union Mangae Account method  ");		
	}
}
