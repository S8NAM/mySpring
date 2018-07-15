package com.ss.sh.godok.post.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostDAOMybatis implements PostDAO{
	private String namespace="com.sql.godokPost.";
	@Autowired SqlSessionTemplate sqlSession;
	
	@Override
	public List<PostVO> selectAll() {
		return sqlSession.selectList(namespace+"selectAll");
	}
	
}
