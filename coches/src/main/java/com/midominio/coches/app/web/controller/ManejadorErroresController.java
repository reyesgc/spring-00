package com.midominio.coches.app.web.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@ControllerAdvice
public class ManejadorErroresController {

	@ExceptionHandler(ArithmeticException.class)
	public String m(ArithmeticException ex, Model model) {
		model.addAttribute("titulo", "Error aritmético");
		model.addAttribute("error", "Error aritmético");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status",  HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", LocalDate.now());
		return "errores/dividido-por-cero";
	}
	
}
