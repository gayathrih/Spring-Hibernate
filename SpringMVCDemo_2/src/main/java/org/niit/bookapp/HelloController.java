package org.niit.bookapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/helloctrl")
public class HelloController {
	
	/*Handlers*/
	
	@RequestMapping("/wish")
	//@ResponseBody
	 public String wishMsg(){
		 return "wish"; //view page
	 }

	@RequestMapping("/msg")
		 public String   msg(){
			 return "msg"; //view page
		 }
	
	@RequestMapping("/hai")
	public String hello(Model model){
		
		  String name="Smith";
		  
		  model.addAttribute("nameValue", name);
		  
		  return "hai";
	}

}
