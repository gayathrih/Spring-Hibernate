package app.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import app.model.Customer;

public class AppMain {
	public static void main(String[] args) {
		 
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Customer.class);
		
		   ServiceRegistryBuilder registryBuilder =  new ServiceRegistryBuilder();
		   
		   registryBuilder.applySettings(cfg.getProperties());
		   
		   ServiceRegistry serviceRegistry=   registryBuilder.buildServiceRegistry();
		  
		   SessionFactory sf =  cfg.buildSessionFactory(serviceRegistry);
		   
		     Session session = sf.openSession();
		     
		       Transaction trans = session.beginTransaction();
		       
		         Customer c =  new Customer();
		           c.setId(201);
		           c.setName("Laxman");
		           c.setAddress("Chennai");
		           
		         session.save(c); 
		         
		         trans.commit();
		           System.out.println("Done!!!!");
	
		
	}

}
