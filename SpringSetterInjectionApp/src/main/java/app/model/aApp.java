package app.model;


class Parent{
	
	 void test(){}
}

class Child extends Parent{
	
	 void show(){}
	 
}
public class aApp {

	 public static void main(String[] args) {
		
		   /*Child obj = new Child();
		    obj.test();
		    obj.show();*/
		 
		 Parent p =  new Child();
		 p.test();
		 //p.show();
		 
		 Child obj2 = (Child)p; //Downcating
		   obj2.test();
		   obj2.show();
	}
}
