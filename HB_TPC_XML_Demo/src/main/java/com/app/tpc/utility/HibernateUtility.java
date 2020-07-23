package com.app.tpc.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.app.tpc.model.Book;

public class HibernateUtility {
	
	private static SessionFactory sessionFactory=null;
	
	
	public static SessionFactory getMyHBSessionFactory(){
		
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Book.class);
		
		   ServiceRegistryBuilder registryBuilder =  new ServiceRegistryBuilder();
		   
		   registryBuilder.applySettings(cfg.getProperties());
		   
		   ServiceRegistry serviceRegistry=   registryBuilder.buildServiceRegistry();
		  
		   sessionFactory=  cfg.buildSessionFactory(serviceRegistry);
		   
		   return  sessionFactory;
	}
	

}
