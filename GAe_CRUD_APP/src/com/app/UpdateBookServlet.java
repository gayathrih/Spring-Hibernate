package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.apphosting.utils.config.ClientDeployYamlMaker.Request;
import com.googlecode.objectify.Key;

public class UpdateBookServlet extends HttpServlet {

	
	  public void doGet(HttpServletRequest req  , HttpServletResponse res) throws IOException{
		   res.setContentType("text/html");
		   
		   PrintWriter pw= res.getWriter(); 
		  // get from parameters
		     long id= Long.parseLong(req.getParameter("bid"));
		     
		      Key k =  Key.create(Book.class , id);   
		     
		        Book bookobj  = (Book)ConnectService.ofy().load().key(k).now();
		        
		     
		        pw.print("<form action='/gae_crud_objectifydemo/updatebook_2.do'>");
		        pw.print(" Book ID: <input type='number' name='bookid' value='"+bookobj.getBid()+"'><br>");
		        pw.print("Enter Update Book Name: <input type='text' name='bookname' value='"+bookobj.getBname()+"'><br>");
		        pw.print("Enter Update Book price: <input type='number' name='bookprice' value='"+bookobj.getBprice()+"'><br>");
		        pw.print("<input type='submit' value='Update'><br>");
		        pw.print("</form>");
		        
		        
		      
		    
		  
	  }
}
