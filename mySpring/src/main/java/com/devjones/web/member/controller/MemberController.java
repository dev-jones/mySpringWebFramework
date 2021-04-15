package com.devjones.web.member.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devjones.web.mapper.StudentDao;
import com.devjones.web.member.dto.MemberDto;
import com.devjones.web.member.service.MemberService;

@Controller
public class MemberController {

	private Logger LOG = LoggerFactory.getLogger(this.getClass());
	
//	@Autowired
//	private MemberService memberService;
	
//	@Autowired
//	private StudentDao memberDao;
	
	@RequestMapping(value="/getMemberAllList.do", method=RequestMethod.GET)
	public String getMemberAllList(Model model) {
		
//		List<MemberDto> list = memberDao.getStudentList();
//		
//		model.addAttribute("list", list);
		
		return "getMemberAllList";
	}
}
