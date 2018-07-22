package com.ss.sh.faq.model;

import java.util.List;


public interface FaqDAO {
	public int insertFaq (FaqVO faqVo);
	public List<FaqVO> selectAll (String category);
}
