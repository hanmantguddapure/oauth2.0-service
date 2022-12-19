package com.oauth2.service;

import java.time.LocalDateTime;

import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.UserDetails;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public UserDetails getUserDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveUserDetails(OAuth2User user, OAuth2UserRequest userRequest) {
		UserDetails userDetails = new UserDetails();
		// userDetails.setEmail(userRequest.getAdditionalParameters().get(userDetails));
		System.out.println(userRequest.getAccessToken().getExpiresAt().toString());
		System.out.println(userRequest.getAccessToken().getIssuedAt().toString());
		userDetails.setToken(userRequest.getAccessToken().getTokenValue());
		return "Saved successfully";

	}

}
