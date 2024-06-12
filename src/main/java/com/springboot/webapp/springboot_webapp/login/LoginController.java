package com.springboot.webapp.springboot_webapp.login;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	//private Logger logger = LoggerFactory.getLogger(getClass());
	AuthenticationService authService;
	
	public LoginController (AuthenticationService  authService) {
		this.authService = authService;
	}
	
//	@RequestMapping("login")
//	public String login(@RequestParam String name,ModelMap model) {
//		logger.debug("The name is: "+name);
//		System.out.println("The name is: "+name);
//		model.put("name", name);
//		return "login";
//		
//	}
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		
		return "login";
		
	}
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String welcome(@RequestParam String userName,@RequestParam String password,ModelMap model ) {
		
		// Authentication (hard-coded)
		//UserName -> raghab007
		// Password -> password
		boolean validUser = authService.authenticate(userName, password);
		if(validUser) {
			model.addAttribute("userName",userName);
			model.addAttribute("password",password);
			return "welcome";
			
		}
		model.addAttribute("error","Please enter valid username or password");
		return "login";		
	}	
		
	
}
