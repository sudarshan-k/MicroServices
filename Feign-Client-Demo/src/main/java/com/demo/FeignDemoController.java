package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignDemoController {
	
	@Autowired
	private FeignServiceUtil feignServiceUtil;
	
	
	@GetMapping("/users")
	public Object getUsers() {
		return feignServiceUtil.getUsers();
	}

}
