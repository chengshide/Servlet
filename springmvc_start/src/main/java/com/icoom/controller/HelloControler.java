package com.icoom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//��������
@Controller
public class HelloControler {

	@RequestMapping(path="/hello")
	public String sayHello() {
		System.out.println("Hello StringMVC");
		return "success";
	}
}
