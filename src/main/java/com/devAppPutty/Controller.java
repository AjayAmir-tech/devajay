package com.devAppPutty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value="/getName")
	public String getName() {
		return "git to docker to putty to docker ";
	}

}