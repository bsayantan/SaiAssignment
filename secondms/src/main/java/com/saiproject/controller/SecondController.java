package com.saiproject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.saiproject.model.Loger;
import com.saiproject.model.User;
import com.saiproject.model.UserRepo;
@RestController
public class SecondController {
	
	@Autowired
	UserRepo ur;
	
	@LoadBalanced
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping(value="/validate",method=RequestMethod.POST)	  
	public Boolean sai(@RequestBody Loger loger) 
	
	{		 
		  
		  Optional<User> optional =ur.findById(loger.getUsername());
		  if(optional.isPresent()) {
			     if(optional.get().getPassword().equals(loger.getPassword()))
			  {
				  return true;
			  }
			  else
			  {
				  return false;
			  }
			} else {
			    return false;
			}	
}
	 @RequestMapping(value="/register",method=RequestMethod.POST)	  
	  public Boolean sai(@RequestBody User user) {		 
		  
		  ur.save(user);
		  Boolean b = true;
		  return b;	
}

}
