package com.infosys.samples.mvc.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleControllerRevisited {
/*
	@RequestMapping(value="/simple/revisited", method=RequestMethod.GET, headers="Accept=text/plain")
	public @ResponseBody String simple() {
		return "Hello world revisited!";
	}
*/
	@RequestMapping("/simple/showjsp")
	public String showJsp(){
		return "myJsp";
	}
	
	@RequestMapping(value="/simple/revisited",method=RequestMethod.GET, headers="Accept=text/plain")
	public @ResponseBody String simpleRevisted(){
		return "Hello world revisted!";
	}
	
}
