package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.client.HystrixClient;
import com.jt.client.SidecarClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HelloController {
	@Autowired
	private HystrixClient hystrixClient;
	@Autowired
	private SidecarClient sidecarClient;
	
	@RequestMapping("/hello/{name}")
	@HystrixCommand(fallbackMethod="helloFall")
	public String hello(@PathVariable String name) {
		return hystrixClient.hello(name);
	}
	
	public String helloFall(String name) {
		return "业务繁忙";
	}
	
	@RequestMapping("/")
	public String node() {
		return sidecarClient.node();
	}
}
