package com.phos.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phos.entity.Board;
import com.phos.entity.PagingVO;
import com.phos.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/*")
public class AdminController {
	
	private final BoardService boardService;
	
	@GetMapping("/index")
	public String index() {
		return "admin/index";
	}
	
	@GetMapping("/board")
	public String board(PagingVO vo
			,Model model
			,@RequestParam(value="nowPage", required=false)String nowPage
			,@RequestParam(value="cntPerPage", required=false)String cntPerPage) {
		
		int total = boardService.countAll();
		if (nowPage == null && cntPerPage == null) {
			nowPage = "1";
			cntPerPage = "10";
		} else if (nowPage == null) {
			nowPage = "1";
		} else if (cntPerPage == null) { 
			cntPerPage = "10";
		}
		
		vo = new PagingVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
		model.addAttribute("paging", vo);
		
		List<Board> boardList = boardService.selectAll(vo);
		model.addAttribute("boardList", boardList);
		
		return "admin/board";
	}
	
	@GetMapping("/detail")
	@ResponseBody 
	public Board detail(@RequestParam("num") int boardNum) {
		Board data = boardService.getDetail(boardNum);
		return data;
	}
	
	@PostMapping("/reply")
	public String reply(
			@ModelAttribute("board") Board boardVo) {
		
		boardService.insertReply(boardVo);
		return "redirect:/admin/board";
	}

 	
}