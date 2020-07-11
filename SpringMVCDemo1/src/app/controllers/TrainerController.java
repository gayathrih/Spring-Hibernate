package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/trinercontroller")
public class TrainerController {
	
	@RequestMapping("/java")
	@ResponseBody
	 public String javaTrainer(){
		 return "This is java Triner handler";
	 }
	
	
	@RequestMapping("/python")
	@ResponseBody
	 public String pythonTrainer(){
		 return "<h1>This is Python Triner handler</h1>";
	 }

}
