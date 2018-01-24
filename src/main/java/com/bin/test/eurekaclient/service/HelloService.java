package com.bin.test.eurekaclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloService {
	
	@Value("${server.port}")
	private static String port;
	@RequestMapping("/hello")
	public String sayHello(@RequestParam String name){
		return "hello"+name+",i am from port:"+port;
	}
}
