package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.apphosting.utils.config.ClientDeployYamlMaker.Request;
import com.googlecode.objectify.Key;

public class UpdateBookServlet_2 extends HttpServlet {

	
	  public void doGet(HttpServletRequest req  , HttpServletResponse res) throws IOException{
		   res.setContentType("text/html");
		   
		   PrintWriter pw= res.getWriter(); 
		   // get from parameters
		     long uid= Long.parseLong(req.getParameter("bookid"));
		      String uname=  req.getParameter("bookname");
		      float uprice =  Float.parseFloat(req.getParameter("bookprice"));
		      
		      Book bookObj =  new Book();
		        bookObj.setBid(uid);
		        bookObj.setBname(uname);
		        bookObj.setBprice(uprice);
		        
		        ConnectService.ofy().save().entity(bookObj).now();
		        
		        res.getWriter().print(" Book Updated...!!");
		        
		        
		      
		    
		  
	  }
}
