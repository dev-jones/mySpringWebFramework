package com.devjones.web.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devjones.web.member.dao.MemberDao;
import com.devjones.web.member.dto.MemberDto;
import com.devjones.web.member.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;
	
	@Override
	public MemberDto selectMemberAllList() {
		
		return memberDao.selectMemberAllList();
	}

}
