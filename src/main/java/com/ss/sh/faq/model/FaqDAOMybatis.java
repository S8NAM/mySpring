package com.ss.sh.faq.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class FaqDAOMybatis implements FaqDAO {
	private String namespace="com.sql.faq.";
	@Autowired SqlSessionTemplate sqlSession;
	
	@Override
	public int insertFaq(FaqVO faqVo) {
		return sqlSession.insert(namespace+"insertFaq", faqVo);
	}

	@Override
	public List<FaqVO> selectAll(String category) {
		return sqlSession.selectList(namespace+"selectAll", category);
	}


	
}
