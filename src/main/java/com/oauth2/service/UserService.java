package com.oauth2.service;

import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.user.OAuth2User;

import com.UserDetails;

public interface UserService {
	public UserDetails getUserDetail();

	public String saveUserDetails(OAuth2User user, OAuth2UserRequest userRequest);

}
