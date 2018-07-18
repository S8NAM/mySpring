package com.ss.sh.godok.post.controller;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ss.sh.godok.model.GodokVO;
import com.ss.sh.godok.post.model.PostService;
import com.ss.sh.godok.post.model.PostVO;

@Controller
@RequestMapping("/godok/post")
public class GodokPostListController {
private static final Logger logger
=LoggerFactory.getLogger(GodokPostListController.class);
@Autowired PostService postService;

	@RequestMapping(value="/list.do")
	public String postList(Model model, @RequestParam int no) {
		List<PostVO> list = postService.selectAll(no);
		model.addAttribute("list", list);
		logger.info("포스트 리스트! list.size()={}",list.size());
		return "godok/post/list";
	}
	
	@RequestMapping(value="write.do", method=RequestMethod.GET)
	public String postWrite_get() {
		logger.info("포스트 작성 화면!");
		return"godok/post/write";
	}
	
	@RequestMapping(value="write.do", method=RequestMethod.POST)
	public String postWrite_post(@ModelAttribute PostVO postVo , @RequestParam int threadNo) {
		int cnt=postService.insertPost(postVo);
		logger.info("포스트 작성 완료!");
		//redirectAttributes.addAttribute("no",threadNo); 이건 리다이렉트 할때 파라미터 전달하는것
		
		return"redirect:/godok/post/list.do?no="+threadNo;
	}
}
