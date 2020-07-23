package com.app.tpc.client;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.tpc.model.Book;
import com.app.tpc.model.ComicBook;
import com.app.tpc.model.NovelBook;
import com.app.tpc.utility.HibernateUtility;

public class Client {
	
	 public static void main(String[] args) {
		
		 SessionFactory sf = HibernateUtility.getMyHBSessionFactory();
		 
		 Session session=sf.openSession();
		 
		 Transaction trans = session.beginTransaction();
		 
		 
		  Book book  =  new Book(1,"two-in-one","ABC_Author",100.0F);
		  
		  ComicBook comicBook = new ComicBook(2, "A_CB", "A_Author",200.3F,"A_Publisher");
		  
		  NovelBook novelBook =  new NovelBook(3, "X_NB", "X_Author", 150.5F,"X_Novel_Fiction");
		  
		  session.save(book);
		  session.save(comicBook);
		  session.save(novelBook);
		  
		  trans.commit();
		  
		  
		  System.out.println("Completed..!");
		  
	}

}
