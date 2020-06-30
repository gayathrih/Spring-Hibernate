package app.model;

public class Client {

	 public static void main(String[] args) {
		
		   Book b1 = new Book();
		     b1.setBookId(1);
		     b1.setBookName("Java");
		      b1.setVersion(14.0F);
		      
		      Book b2 = new Book();
			     b2.setBookId(2);
			     b2.setBookName("Python");
			      b2.setVersion(1.0F);
		   
		    //System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getVersion());
		   
		   System.out.println(b1);
		 System.out.println(b2);
	}
}
