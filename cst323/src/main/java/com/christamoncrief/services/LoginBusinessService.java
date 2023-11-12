package com.christamoncrief.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.christamoncrief.interfaces.LoginBusinessServiceInterface;
import com.christamoncrief.model.User;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Primary
public class LoginBusinessService implements LoginBusinessServiceInterface {

	//Returns a login model
	//Would likely be where login data would be compared to database
	//-ScribeEzra
	@Override
	public User getUserModel() {
		User userModel = new User();
		
		return userModel;
	}

	@Override
	@PostConstruct
	public void init() {
		//This is where it would connect to a hypothetical database of user data
		//-ScribeEzra
		System.out.println("LoginBusinessService init() activated");
	}

	@Override
	@PreDestroy
	public void destroy() {
		//This is where it would disconnect from a hypothetical database of user data
		//-ScribeEzra
		System.out.println("LoginBusinessService destroy() activated");
	}

}
