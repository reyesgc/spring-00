package com.midominio.evaluable2.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class DemoErrorsController {
	
	@GetMapping("/template-no-existe")
	public String m1() {
		return "template-no-existe";
	}
	
	@GetMapping("/division-por-0")
	public String m2() {
		int x = 1/0;
		return "template-no existe";
	}
	
	@GetMapping("/null-pointer")
	public String m3() {
		String s = null;
		s.length();
		return "template-no existe";
	}
}
