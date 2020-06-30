package app.demo;

public class HDFCAccountServiceImpl implements AccountService{

	@Override
	public void createAccount() {
       System.out.println("  HDFC create Account method");		
	}

	@Override
	public void manageAccount() {
        System.out.println(" HDFC Mangae Account method  ");		
	}
	
	void test(){
		  System.out.println("HDFC Test methd");
	}

}
