package com.bjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	// 注意：这里需要使用dubbox提供的应用注解，该注解的作用是远程注入
	@Reference
	private UserService userService;
	
	@RequestMapping("/showName")
	@ResponseBody
	public String showName(){
		return userService.getName();
	}

}
