package com.as.kim.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.as.kim.service.BoardService;
import com.as.kim.vo.BoardVO;

@Controller
public class BoardController {
	
	@Resource(name="boardService")
	private BoardService boardService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/boardList.do", method = RequestMethod.GET)
	public String boardList(Model model) throws Exception {

		List<BoardVO> list = boardService.selectBoardList();

		logger.info(list.toString());

		model.addAttribute("list", list);

		return "board/boardList";
	}
}
