package com.ss.sh.godok.model;

import java.util.List;


public interface GodokDAO {
	public int threadWrite (GodokVO vo);
	public List<GodokVO> selectAll ();
	public GodokVO selectThread (int no);

}
