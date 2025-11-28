package com.hindhu.religion.GaneshYouthCommunity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hindhu.religion.GaneshYouthCommunity.dto.SignUpDto;
import com.hindhu.religion.GaneshYouthCommunity.entity.UserSignIn;
import com.hindhu.religion.GaneshYouthCommunity.service.SignupService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class Signup {
	@Autowired
	private SignupService service;
	
	@GetMapping("/signup")
	public ModelAndView signUp() {
		log.info("Signup form requested");
		ModelAndView view= new ModelAndView();
		view.addObject("key", new SignUpDto());
		view.setViewName("sign_up_page");
		log.info("signup form returned");
		return view;
	}
	
	@PostMapping("/signup")
	public ModelAndView loginProcess(@ModelAttribute("key") SignUpDto dto) {
		log.info("recived signup_process request");
		UserSignIn user=service.save(dto);
		
		log.info("Processed signup request");
		ModelAndView view = new ModelAndView();
		view.addObject("result", user);
		view.setViewName("sign_up_result");
		log.info("added model into view and retunred model");
		return view;
		
	}

}
