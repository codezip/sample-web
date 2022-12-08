package com.example.sampleweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sampleweb.mapper.HelloMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class HelloService {

	@Autowired
	HelloMapper helloMapper;

	public String hello() {
		return helloMapper.getHello();
	}
}
