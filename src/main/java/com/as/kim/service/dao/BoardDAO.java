package com.as.kim.service.dao;

import java.util.List;

import com.as.kim.vo.BoardVO;

public interface BoardDAO {

	List<BoardVO> selectBoardList() throws Exception;
	
	String InsertBoardList(BoardVO vo) throws Exception;
	
}
