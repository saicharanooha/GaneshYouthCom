package com.hindhu.religion.GaneshYouthCommunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BasicAuthLogIn {
	@GetMapping("/login")
	public String login() {
		log.info("login page requested and returned ");
		
		return "login";
	}

}
