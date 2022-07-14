package com.example.demo.services;
import java.util.*;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		if(username.equals("vkvinay15")) {
			return new User("vkvinay15", "vkvinay", new ArrayList<>());
		}
		else {
			throw new UsernameNotFoundException(username);
		}
	}

}
