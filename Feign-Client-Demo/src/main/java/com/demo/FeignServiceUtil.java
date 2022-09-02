package com.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feignDemo", url="https://jsonplaceholder.typicode.com")
public interface FeignServiceUtil {
	
	
	@GetMapping("/users")
	public Object getUsers();

}
