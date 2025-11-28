package com.hindhu.religion.GaneshYouthCommunity.controller;

import org.slf4j.Logger;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomePage {

    @GetMapping("/")
    public String homePage() {
    	log.info("login sucessfull");
    	String s=SecurityContextHolder.getContext().getAuthentication().getName();
    	log.info("Logged-in username: {}", s);

        log.info("Home page requested");
        log.info("homepagen returned");
        return "homepage"; 
      }
    @GetMapping("/usermenu")
    public String usermenu() {
    	return "usermenu";
    }
   
}
