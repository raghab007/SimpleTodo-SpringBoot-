package com.springboot.webapp.springboot_webapp.login;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {
	public boolean authenticate(String userName, String password) {
		return userName.equals("raghab007") && password.equals("raghab@123");
	}

}
