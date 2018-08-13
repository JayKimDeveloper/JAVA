package com.as.kim.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.as.kim.service.BoardService;
import com.as.kim.service.dao.BoardDAO;
import com.as.kim.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardMapper;

	@Override
	@Transactional
	public List<BoardVO> selectBoardList() throws Exception {
		return boardMapper.selectBoardList();
	}

	@Override
	@Transactional
	public String InsertBoardList(BoardVO vo) throws Exception {
		return boardMapper.InsertBoardList(vo);
	}
	
	
	
}
