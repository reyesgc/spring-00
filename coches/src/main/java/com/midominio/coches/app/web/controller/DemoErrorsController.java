package com.midominio.coches.app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoErrorsController {
	@GetMapping("/div-por-0")
	public String errorDivisionPorCero() {
		System.out.println(1/0);
		return"";
	}
	
	@GetMapping("/null")
	public String m3() {
		String s = null;
		s.length();
		return "";
	}
	
	@GetMapping("/template-no-existe")
	public String m1() {
		return "";
	}
}
