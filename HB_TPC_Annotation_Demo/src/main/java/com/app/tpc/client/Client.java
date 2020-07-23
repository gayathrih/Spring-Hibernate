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
		 
		 
		  Book book  =  new Book(1,"two-in-one","James_Author",100.0F);
		  
		  ComicBook comicBook = new ComicBook(2, "ComibBook", "ComicBook_Author",200.3F,"ComicBook_Publisher");
		  
		  NovelBook novelBook =  new NovelBook(3, "NovelBook", "NovelBook_Author", 150.5F,"NovelBook_Fiction");
		  
		  session.save(book);
		  session.save(comicBook);
		  session.save(novelBook);
		  
		  trans.commit();
		  
		  
		  System.out.println("Completed..!");
		  
	}

}
