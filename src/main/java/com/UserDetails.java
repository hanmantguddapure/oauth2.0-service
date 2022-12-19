package com;

public class UserDetails {
	private String username;
	private String email;
	private String token;
	private String expireToken;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getExpireToken() {
		return expireToken;
	}

	public void setExpireToken(String expireToken) {
		this.expireToken = expireToken;
	}

}
