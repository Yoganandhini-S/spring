package com.demo.gce.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
@Controller
public class democontroller {
	
	@RequestMapping("/")
		public String home() {
			return"New";
		}
}