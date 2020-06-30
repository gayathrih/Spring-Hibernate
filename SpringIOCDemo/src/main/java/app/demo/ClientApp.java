package app.demo;

public class ClientApp {
	
	 public static void main(String[] args) {
		
		/*HDFCAccountServiceImpl  hdfcobj  = new HDFCAccountServiceImpl();
		  hdfcobj.createAccount();
		  hdfcobj.manageAccount();
		  
	  SBIAccountServiceImpl  sbiobj = new SBIAccountServiceImpl();
	  
	      sbiobj.createAccount();
	      sbiobj.manageAccount();*/
		 
		 /* HDFCAccountServiceImpl obj = (HDFCAccountServiceImpl) accService;
	        obj.createAccount();
	        obj.manageAccount();
	        obj.test();*/
		 
		   AccountService accService  = new SBIAccountServiceImpl();
		    accService.createAccount();
		    accService.manageAccount();
		    
		    
		     
	}

}
