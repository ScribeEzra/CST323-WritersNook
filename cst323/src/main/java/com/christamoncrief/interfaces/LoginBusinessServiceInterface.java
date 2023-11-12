package com.christamoncrief.interfaces;

import com.christamoncrief.model.User;

public interface LoginBusinessServiceInterface {

	//Interface is needed for IoC Container as it is ideal for inheritance
	//-ScribeEzra
	public User getUserModel();
	
	public void init();
	
	public void destroy();
}