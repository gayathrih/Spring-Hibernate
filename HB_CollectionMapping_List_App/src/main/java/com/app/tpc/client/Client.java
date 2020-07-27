package com.app.tpc.client;



import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.model.Customer;
import com.app.model.Product;
import com.app.tpc.utility.HibernateUtility;


public class Client {
	
	 public static void main(String[] args) {
		
		 SessionFactory sf = HibernateUtility.getMyHBSessionFactory();
		 
		 Session session=sf.openSession();
		 
		 Transaction trans = session.beginTransaction();
		 
		 
		  Product p1= new Product(1,"Pen");
		  Product p2= new Product(2,"computer");
		  Product p3= new Product(3,"Book");
		  Product p4= new Product(4,"Mouse");
		  //Product p5= new Product(4,"Mouse");
		  
		 List<Product>  pset =  new LinkedList<Product>();
		  pset.add(p1);
		  pset.add(p2);
		  pset.add(p3);
		  pset.add(p4);
		  //pset.add(p5);
		  
		  Customer  c1 =  new Customer(2, "B", pset);
		  
		  session.save(p1);
		  session.save(p2);
		  session.save(p3);
		  session.save(p4);
		  //session.save(p5);
		  
		  session.save(c1);
		     
		     
		
		  trans.commit();
		  
		  
		  System.out.println("Completed..!");
		  
	}

}