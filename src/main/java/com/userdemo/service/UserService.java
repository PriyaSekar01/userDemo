package com.userdemo.service;

import org.springframework.stereotype.Service;

import com.userdemo.entity.User;
import com.userdemo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	
	private final UserRepository userRepository;

	public User create(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

}
