package com.jag.springBoot.web.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean validateUser(String userId, String password){
		return userId.equalsIgnoreCase("jag") && password.equalsIgnoreCase("dummy");
	}
	
}
