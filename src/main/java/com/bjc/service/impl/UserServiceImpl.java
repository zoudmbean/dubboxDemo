package com.bjc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjc.service.UserService;

// 注意：这里的service注解用的是dubbox的
@Service
public class UserServiceImpl implements UserService{

	@Override
	public String getName() {
		return "Mary";
	}

}
