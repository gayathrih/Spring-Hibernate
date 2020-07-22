package app.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import app.model.Customer;

public class AppMain {
	public static void main(String[] args) {
		
		Configuration cfg =  new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 
		 SessionFactory sf = cfg.buildSessionFactory();
		 
		 Session session = sf.openSession();
		 
		 Transaction transaction  =session.beginTransaction();
		 
		 
		 Customer c1 = new Customer();
		  c1.setId(100);
		  c1.setName("ALLEN");
		  c1.setAddress("Bnagalore");
		  
		  Customer c2 = new Customer();
		  c2.setId(101);
		  c2.setName("Smith");
		  c2.setAddress("Chennai");
		  
		  session.save(c1);
		  session.save(c2);
		  
		  transaction.commit();
		  
		  System.out.println("Done!!!!");
	
		
	}

}
