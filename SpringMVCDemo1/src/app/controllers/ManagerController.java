package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/managercontroller")
public class ManagerController {

	
	@RequestMapping("/getMgr.do")
	@ResponseBody
	public String getManager(){
		
		return "This is Manager Handler...!!";
	}
	
	@RequestMapping("/InfoMgr.do")
	@ResponseBody
	public String managerDetails(){
		 return "Name: Smith <br> Address: Bangalore.";
	}
}
