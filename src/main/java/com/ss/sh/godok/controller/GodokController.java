package com.ss.sh.godok.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ss.sh.godok.model.GodokService;
import com.ss.sh.godok.model.GodokVO;

@Controller
@RequestMapping("/godok")
public class GodokController {
	private static final Logger logger = LoggerFactory.getLogger(GodokController.class);
@Autowired private GodokService godokService;

	@RequestMapping(value="/write.do", method=RequestMethod.GET)
	public String godokWrite_get() {
		logger.info("스레드 작성 화면!");
		return"godok/write";
	}
	
	@RequestMapping(value="/write.do", method=RequestMethod.POST)
	public String godokWrite_post(@ModelAttribute GodokVO vo) {
		int cnt = godokService.threadWrite(vo);
		logger.info("스레드 작성!");
		return"redirect:/godok/list.do";
		//해당 스레드의 포스트 작성 화면으로 redirect 되게 할 것 
	}
	
	@RequestMapping(value="/list.do")
	public String list(Model model) {
		List<GodokVO> list = godokService.selectAll();
		model.addAttribute("list", list);
		logger.info("스레드 리스트!");
		return "godok/list";
	}
	
	@RequestMapping(value="/detail.do")
	public String detail() {
		logger.info("스레드 디테일!");
		return "godok/detail";
	}
}
