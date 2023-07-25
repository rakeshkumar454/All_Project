package com.globallogic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductController {

	@GetMapping("/get")
	public String helloWorld() {
		return "hello world";
	}
}
