package com.app.tpc.client;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.app.tpc.utility.HibernateUtility;
import com.app.tph.CardPayment;
import com.app.tph.CashPayment;
import com.app.tph.Payment;

public class Client {
	
	 public static void main(String[] args) {
		
		 SessionFactory sf = HibernateUtility.getMyHBSessionFactory();
		 
		 Session session=sf.openSession();
		 
		 Transaction trans = session.beginTransaction();
		 
		 
		   Payment payment   = new Payment();
		     payment.setPayId(1);
		     payment.setPayAmount(1000F);
		     
		     
		  CardPayment cardPayment = new CardPayment();
		    cardPayment.setPayId(2);
		    cardPayment.setPayAmount(1200.4F);
		    cardPayment.setExpiryDate("01-JAN-2021");
		    
		    CashPayment  cashPayment =  new CashPayment();
		    
		      cashPayment.setPayId(3);
		      cashPayment.setPayAmount(2100.777F);
		      cashPayment.setReceiptNo(12341);
		      
		      
		      session.save(payment);
		      session.save(cardPayment);
		      session.save(cashPayment);
		     
		     
		
		  trans.commit();
		  
		  
		  System.out.println("Completed..!");
		  
	}

}
