package com.ss.sh.faq.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaqServiceImpl implements FaqService {
@Autowired FaqDAO faqDao;

	@Override
	public int insertFaq(FaqVO faqVo) {
		return faqDao.insertFaq(faqVo);
	}

	@Override
	public List<FaqVO> selectAll(String category) {
		return faqDao.selectAll(category);
	}

}
