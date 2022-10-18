package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.bean.Login;
import com.hospital.service.LoginService;

@RestController
@RequestMapping(value = "login")
@CrossOrigin
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping(value = "signIn", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signIn(@RequestBody Login login) {
		 System.out.println(login);
		return loginService.signIn(login);
	}
	
	@PostMapping(value = "signUp", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signUp(@RequestBody Login login) {
		return loginService.signUp(login);
	}
	
//	@GetMapping(value = "note")
//	public String note() {
//		return loginService.note();
//	}

}
