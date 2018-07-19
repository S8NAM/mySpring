package com.ss.sh.godok.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GodokServiceImpl implements GodokService {
@Autowired GodokDAO godokDao;
	@Override
	public int threadWrite(GodokVO vo) {
		return godokDao.threadWrite(vo);
	}
	@Override
	public List<GodokVO> selectAll() {
		return godokDao.selectAll();
	}
	@Override
	public GodokVO selectThread(int no) {
		return godokDao.selectThread(no);
	}

}
