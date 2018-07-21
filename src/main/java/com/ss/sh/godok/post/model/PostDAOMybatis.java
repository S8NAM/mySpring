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
	public List<PostVO> selectAll(int no) {
		return sqlSession.selectList(namespace+"selectAll", no);
	}

	@Override
	public int insertPost(PostVO postVo) {
		return sqlSession.insert(namespace+"insertPost", postVo);
	}

	@Override
	public int updatePostNo(PostVO postVo) {
		return sqlSession.update(namespace+"updatePostNo", postVo);
	}

}
