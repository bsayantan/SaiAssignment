package com.saiproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.saiproject.model.Loger;
import com.saiproject.model.User;


@RestController
public class MainController {
	
	  @Autowired
	  private RestTemplate rt;  
	  
	  @RequestMapping("/login")
	  public ModelAndView index () { 
		  ModelAndView  modelAndView = new ModelAndView(); 
		  modelAndView.setViewName("login.html");
	      return modelAndView;
	  }
	  

	  @RequestMapping(value="/validate",method=RequestMethod.POST)	  
	  public ResponseEntity<Object> loginValidation(@RequestBody Loger loger) {
		  boolean response=false;
		  //System.out.println(loger.toString());
		  response = rt.postForObject("http://microservice2/validate", loger, Boolean.class );
		  String res = ""+response;
		  return new ResponseEntity<>(res,HttpStatus.OK);	      
	  
	
}
	  @RequestMapping(value="/register",method=RequestMethod.POST)	  
	  public ResponseEntity<Object> userRegistration(@RequestBody User user) {
		  boolean response=false;
		  response = rt.postForObject("http://microservice2/register", user, Boolean.class );
		  String res = ""+response;
		  return new ResponseEntity<>(res,HttpStatus.OK);	      
	  
	
}
}