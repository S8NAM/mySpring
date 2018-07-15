package com.ss.sh.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ss.sh.HomeController;

@Controller
@RequestMapping("/new1")
public class newController {
	private static final Logger logger = LoggerFactory.getLogger(newController.class);
	
	@RequestMapping(value="/New1.do", method = RequestMethod.GET)
	public String new1(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "new1/New1";
		
	}
	

	@RequestMapping(value="/el.do",method= RequestMethod.GET)
	public String el_get() {
		logger.info("el언어 get");
		return "new1/el";
	}

	@RequestMapping(value="/el.do" , method=RequestMethod.POST)
	public String el_post(@RequestParam String name , Model model) {
		String elname= name+"씨";
		model.addAttribute("name", elname);
		logger.info("el언어 parameter name 을 post, elname={}",elname);
		return"redirect:/new1/el.do";
	}
}


