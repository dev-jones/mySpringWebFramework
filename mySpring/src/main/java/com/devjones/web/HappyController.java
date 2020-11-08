package com.devjones.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HappyController {

	private Logger LOG = LoggerFactory.getLogger(this.getClass());	// this.getClass()대신 HappyController.class가능
	
	@RequestMapping(value="/happySample.do", method=RequestMethod.GET)
	public String beHappy() {
		
		//System.out.println("해피해피~");
		LOG.info("해피해피~");
		
		return "happySample";
	}
}
