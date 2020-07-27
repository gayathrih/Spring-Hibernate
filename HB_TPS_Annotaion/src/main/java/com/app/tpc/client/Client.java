package com.app.tpc.client;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.tpc.utility.HibernateUtility;
import com.app.tps.CardPayment;
import com.app.tps.CashPayment;
import com.app.tps.Payment;

public class Client {
	
	 public static void main(String[] args) {
		
		 SessionFactory sf = HibernateUtility.getMyHBSessionFactory();
		 
		 Session session=sf.openSession();
		 
		 Transaction trans = session.beginTransaction();
		 
		 
		   Payment payment   = new Payment();
		     payment.setPayId(1);
		     payment.setPayAmount(1000F);
		     
		     
		  CardPayment cardPayment = new CardPayment();
		    cardPayment.setPayId(11);
		    cardPayment.setPayAmount(2000F);
		    cardPayment.setExpiryDate("01-Mar-2021");
		    
		    CashPayment  cashPayment =  new CashPayment();
		    
		      cashPayment.setPayId(111);
		      cashPayment.setPayAmount(3000F);
		      cashPayment.setReceiptNo(3000);
		      
		      
		      session.save(payment);
		      session.save(cardPayment);
		      session.save(cashPayment);
		     
		     
		
		  trans.commit();
		  
		  
		  System.out.println("Completed..!");
		  
	}

}
