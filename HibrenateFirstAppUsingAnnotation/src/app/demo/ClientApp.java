package app.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class ClientApp {
	
	public static void main(String[] args) {
		
		Configuration cfg =  new AnnotationConfiguration().configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction trans = session.beginTransaction();
		
		System.out.println("Enter no.f emp");
		
		 Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  
		
		  for(int i=1;i<=n;i++) {
			  Employee emp  = new Employee(); 
		   System.out.println("Enter Name: ");
		   emp.seteName( sc.next());
		   
		   System.out.println("Enter Role: ");
		   emp.seteRole( sc.next());
		 
		  
		     session.save(emp);
		}
		  
		trans.commit();
		
		System.out.println("Completed...!");
		
	}

}
