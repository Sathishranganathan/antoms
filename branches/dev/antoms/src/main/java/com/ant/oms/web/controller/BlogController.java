package com.ant.oms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/blog")
public class BlogController {
	@RequestMapping("/latest")
	public ModelAndView get(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("blohg/list");
		return mav;
	
	}
}
