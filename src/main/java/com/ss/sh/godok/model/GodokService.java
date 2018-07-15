package com.ss.sh.godok.model;

import java.util.List;

public interface GodokService {
	public int threadWrite (GodokVO vo);
	public List<GodokVO> selectAll ();

}
