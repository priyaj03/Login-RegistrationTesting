package com.hospital.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.bean.Login;
import com.hospital.repo.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository loginRepo;
	
	public String signIn(Login login) {
		Optional<Login> result = loginRepo.findById(login.getId());
		if(result.isPresent()) {
					Login ll = result.get();
					if(ll.getPassword().equals(login.getPassword())) {		
						
						if(login.getRole().equals(ll.getRole()) && login.getRole().equals("doctor")) {
							return "Doctor sucessfully login";
						}else if(login.getRole().equals(ll.getRole()) && login.getRole().equals("patient")){
							return "Patient successfully login";
						}else {
							return "No data found with these details";
						}					
					}else {
						return "Incorrect Password";
					}
		}else {
			return "Incorrect Id";
		}	
	}
	
	
//	public String signUp(Login login) {
//		Optional<Login> result = loginRepo.findById(login.getId());
//		if(result.isPresent()) {
//					return "This id is already registered";
//		}else {
//			Login ll = result.get();
////			if(login.getRole().equals("doctor")) {
////				return "You can't create admin account";
////			}else {
////			String email = login.getEmailid();
//			if(login.getEmailid().equals(ll.getEmailid())) {
//				return "This email is registered already";
//			}else {
//				loginRepo.save(login);
//				return "Account created successfully";
//			}
//			
//		}	
//	}
	
	public String signUp(Login login) {
		Optional<Login> result = loginRepo.findById(login.getId());
//		Login ll = result.get();
//		if(login.getEmailid().equals(ll.getEmailid()) || login.getEmailid().equals(ll.getEmailid()))
		if(result.isPresent()) {
					return "This id is already registered";
		}else {
//			Login ll = result.get();
//			if(login.getRole().equals("doctor")) {
//				return "You can't create admin account";
//			}else {
//			String email = login.getEmailid();
//			if(login.getEmailid().equals(ll.getEmailid())) {
//				return "This email is registered already";
//			}else {
				loginRepo.save(login);
				return "Account created successfully";
			
			
		}	
	}
	
	

}
