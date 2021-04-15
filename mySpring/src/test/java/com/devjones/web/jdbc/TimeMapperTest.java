package com.devjones.web.jdbc;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.devjones.web.mapper.StudentDao;
import com.devjones.web.mapper.TimeMapper;
import com.devjones.web.member.dto.MemberDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/spring/root-context.xml")
public class TimeMapperTest {

	@Autowired
	private TimeMapper timeMapper;
	
	@Autowired
	private StudentDao stuMapper;
	
	private Logger LOG = LoggerFactory.getLogger(this.getClass());
	
//	@Test
//	public void 현시간가져오기() {
//		
//		LOG.info("클래스네임가져오기 : " + timeMapper.getClass().getName());
//		LOG.info("현시각 : " + timeMapper.getTime());
//	}
	
//	@Test
//	public void 현시간가져오기2() {
//		 
//		LOG.info("현시간2 : ");
//		LOG.info(timeMapper.getTime2());
//	}
	
	@Test
	public void 학생테이블접근() {
		
		List<MemberDto> list = stuMapper.getStudentList();
		
		for(MemberDto dto : list) {
			
			System.out.println(dto.toString());
		}
		LOG.info(stuMapper.getTime1());
		LOG.info(stuMapper.getTime3());
	}
	
	
	
	
	
	
	
	
}
