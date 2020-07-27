package com.app;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.apphosting.utils.config.ClientDeployYamlMaker.Request;
import com.googlecode.objectify.Key;

public class RetrieveBookServlet extends HttpServlet {

	
	  public void doGet(HttpServletRequest req  , HttpServletResponse res) throws IOException{
		    // get from parameters
		     long id= Long.parseLong(req.getParameter("bid"));
		     
		      Key k =  Key.create(Book.class , id);   
		     
		        Object obj  =ConnectService.ofy().load().key(k).now();
		        
		        res.getWriter().print(obj);
		        
		        
		      
		    
		  
	  }
}
