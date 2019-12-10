package com.dao.demo;

import com.app.demo.User;

public class UserDAO {
	
	public UserDAO()
	{
		System.out.println("UserDAO constructor initialised");
	}
	public User saveUser(User user)
	{
		System.out.println("User saved successfully");
		return user;
	}
	public void deleteUser(User user) {
		System.out.println("User deleted successfully");
	}
}
