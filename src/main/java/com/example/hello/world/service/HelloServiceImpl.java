package com.example.hello.world.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{

	@Override
	public String hello() {
		String s="Welcome to dev";
		return s;
	}

}
