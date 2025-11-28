package com.hindhu.religion.GaneshYouthCommunity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;

import com.hindhu.religion.GaneshYouthCommunity.dto.SignUpDto;
import com.hindhu.religion.GaneshYouthCommunity.entity.UserProfile;
import com.hindhu.religion.GaneshYouthCommunity.entity.UserSignIn;
import com.hindhu.religion.GaneshYouthCommunity.repository.UserProfileRepo;
import com.hindhu.religion.GaneshYouthCommunity.repository.UserSignInRepo;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class SignupService {
	@Autowired
	private UserProfileRepo profile;
	@Autowired
	private UserSignInRepo signin;
	@Autowired
	private BCryptPasswordEncoder encoder;
	public UserSignIn save(SignUpDto dto) {
		log.info("Request recived inside and being processed");
		UserProfile  prof= new UserProfile();
		log.info("userprofile object created");
		prof.setName(dto.getName());
		prof.setSurname(dto.getSurname());
		prof.setMotherName(dto.getMotherName());
		prof.setFatherName(dto.getFatherName());
		prof.setPlace(dto.getVillege());
		prof.setPincode(dto.getZipcode());
		prof.setEmail(dto.getEmail());
		prof.setEmail(dto.getEmail());
		prof.setPhonenumber(dto.getPhonenumber());
		UserProfile profr=profile.save(prof);
		log.info("created user profile in database ");
		UserSignIn sign= new UserSignIn();
		sign.setId(profr.getId());
		sign.setUsername(dto.getUsername());
		sign.setPassword(encoder.encode(dto.getPassword()));
		log.info("created signin record in db table");
		return  signin.save(sign);
			
		
	}
	
	

}
