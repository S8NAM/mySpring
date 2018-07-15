package com.ss.sh.godok.post.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PostServiceImpl implements PostService{
@Autowired PostDAO postDao;
	@Override
	public List<PostVO> selectAll() {
		return postDao.selectAll();
	}

}
