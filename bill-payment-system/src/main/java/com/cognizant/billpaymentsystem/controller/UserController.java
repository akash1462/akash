package com.cognizant.billpaymentsystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.billpaymentsystem.exception.UserAlreadyExistsException;
import com.cognizant.billpaymentsystem.model.User;
import com.cognizant.billpaymentsystem.repository.UserRepository;
import com.cognizant.billpaymentsystem.service.AppUserDetailsService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	AppUserDetailsService appUserDetailsService;
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("users")
	public List<User> getMenuItem() {
		return (userRepository.getUser());
	}
	
		
	@PostMapping()
	public void signup(@RequestBody @Valid User newUser) throws UserAlreadyExistsException {
		appUserDetailsService.signup(newUser);
	}
}
