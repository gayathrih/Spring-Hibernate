package com.app;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.apphosting.utils.config.ClientDeployYamlMaker.Request;

public class StoreBookServlet extends HttpServlet {

	
	  public void doGet(HttpServletRequest req  , HttpServletResponse res) throws IOException{
		    // get from parameters
		     long id= Long.parseLong(req.getParameter("bid"));
		      String name=  req.getParameter("bname");
		      float price =  Float.parseFloat(req.getParameter("bprice"));
		      
		      Book bookObj =  new Book();
		        bookObj.setBid(id);
		        bookObj.setBname(name);
		        bookObj.setBprice(price);
		        
		        ConnectService.ofy().save().entity(bookObj).now();
		        
		        res.getWriter().print(" Book Stored...!!");
		        
		        
		      
		    
		  
	  }
}
