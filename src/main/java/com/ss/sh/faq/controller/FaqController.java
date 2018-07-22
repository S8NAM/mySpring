package com.ss.sh.faq.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ss.sh.faq.model.FaqService;
import com.ss.sh.faq.model.FaqVO;

@Controller
@RequestMapping(value="/faq")
public class FaqController {
@Autowired FaqService faqService;
public static final Logger logger = LoggerFactory.getLogger(FaqController.class);
	@RequestMapping(value="/faqList.do")
	public String faqList() {
		logger.info("faq list");
		return "faq/faqList";
	}
	
	@RequestMapping(value="/faqAdmin.do")
	public String faqAdmin(Model model, @RequestParam(defaultValue="일반") String category) { //(defaultValue="일반")
		List<FaqVO> list = faqService.selectAll(category);
		model.addAttribute("list", list);
		logger.info("faq admin list.size={} , category={}",list.size(),category);
		
		return "faq/faqAdmin";
	}
	
	@RequestMapping(value="/write.do", method=RequestMethod.GET)
	public String faqWrite() {
		logger.info("faq list");
		return "faq/write";
	}
	
	@RequestMapping(value="/write.do", method=RequestMethod.POST)
	public String faqWrite_post(@ModelAttribute FaqVO faqVo) {
		int cnt=faqService.insertFaq(faqVo);
		logger.info("faq 작성!");
		return"redirect:/faq/faqAdmin.do";
	}
	
}
