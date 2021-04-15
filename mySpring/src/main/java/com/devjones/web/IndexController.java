package com.devjones.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value="/alpha.do")
	public void alpha() {
		
		System.out.println("알파메소드");
	}
}
