package com.ss.sh.godok.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GodokDAOMybatis implements GodokDAO{
	private String namespace="com.sql.godok.";
	
@Autowired SqlSessionTemplate sqlSession;

@Override
public int threadWrite(GodokVO vo) {
	return sqlSession.insert(namespace+"insertThread", vo);
}

@Override
public List<GodokVO> selectAll() {
	return sqlSession.selectList(namespace+"selectAll");
}

@Override
public GodokVO selectThread(int no) {
	return sqlSession.selectOne(namespace+"selectThread", no);
}



}
