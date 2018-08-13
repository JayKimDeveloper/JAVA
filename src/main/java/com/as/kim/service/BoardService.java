package com.as.kim.service;

import java.util.List;

import com.as.kim.vo.BoardVO;

public interface BoardService {

	List<BoardVO> selectBoardList() throws Exception;
	
	String InsertBoardList(BoardVO vo) throws Exception;
	
}
