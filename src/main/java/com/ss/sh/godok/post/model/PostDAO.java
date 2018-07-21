package com.ss.sh.godok.post.model;

import java.util.List;

public interface PostDAO {
	public List<PostVO> selectAll(int no);
	public int insertPost (PostVO postVo);
	public int updatePostNo (PostVO postVo);
}
