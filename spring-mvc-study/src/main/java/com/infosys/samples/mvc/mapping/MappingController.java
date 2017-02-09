package com.infosys.samples.mvc.mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mapping")
public class MappingController {

	@RequestMapping("/path")
	public @ResponseBody String byPath() {
		return "By path";
	}
}
