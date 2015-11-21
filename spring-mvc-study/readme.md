Initialization project
----------
* Create maven web project
* Copy pom.xml from spring-mvc-showcase
* Copy web.xml and spring folder from spring-mvc-showcase


Create first controller
----------
	package org.infosys.sample.mvc.simple;
	
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.ResponseBody;
	
	@Controller
	public class SimpleController {
		
		@RequestMapping("/simple")
		public @ResponseBody String simple(){
			return "Hello Spring MVC!";
		}
	}

Change base-package accordingly	in webapp/WEB-INF/spring/appServlet/controller.xml
----------
From

	<context:component-scan base-package="org.springframework.samples.mvc" />

To

	<context:component-scan base-package="com.infosys.samples.mvc" />
