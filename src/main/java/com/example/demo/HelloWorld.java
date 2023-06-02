package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@RequestMapping("/hello")
	public String hello(){
		return "<h1>Hello Welcome TO STS</h1>";
	}
	@RequestMapping("/devops")
	public String devops(){
		return "<h1>Welcome TO DevOps</h1>";
	}
	@RequestMapping("/tomcat")
	public String tomcat(){
		return "<h1>Hello Welcome To tomcat";
	}
}
