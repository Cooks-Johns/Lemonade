package com.lemonade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/hidden")
	public String hidden(){
		return "hidden";
	}
	
	@RequestMapping("/myAccount")
	public String myAccount(){
		return "myAccount";
	}
	
	@RequestMapping("/button3D")
	public String button3D(){
		return "button3D";
	}

}
