package com.xks.photos.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="xks")
public class Test {

	@RequestMapping(value="test")
	public String test(){
		return "test";
	}
}
