package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;

@Controller
public class maincontrol 
{
	@RequestAttribute("/home")
	public String helloworld()
	{
		return "hello world";
	}
	

}
