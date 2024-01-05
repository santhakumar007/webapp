package com.web.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@GetMapping(value="/web")
	public String web() {
		return "Jenkins loaded!";
	}
}
