package com.arshad;

public class UserValidationService {
	public boolean isUserValid(String user, String password) {
		if (user.equals("user1") && password.equals("password1"))
			return true;
		return false;
	}
}
