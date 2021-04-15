package com.devjones.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.devjones.web.member.dto.MemberDto;

public interface StudentDao {

	public List<MemberDto> getStudentList();
	public String getTime3();
	
	@Select("SELECT sysdate FROM dual")
	public String getTime1();
}
