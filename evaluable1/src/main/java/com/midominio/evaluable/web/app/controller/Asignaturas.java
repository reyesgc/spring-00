package com.midominio.evaluable.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midominio.evaluable.web.app.model.AsignaturasModel;

@Controller
@RequestMapping("/asignatura/listado")
public class Asignaturas {
	
	@GetMapping({"/con"})
	public String listadoConAlumnos(Model model){
		List<AsignaturasModel> asignaturas = new ArrayList<>();
		model.addAttribute("titulo", "Listado con número de alumnos");
		model.addAttribute("cabecera", "Listado con número de alumnos");
		model.addAttribute("parrafo", "Se mostrará una lista de las asignaturas");
		asignaturas.add(new AsignaturasModel(1, "Lengua", "¿Qué es Lorem Ipsum?", "letras", 4, 15));
		asignaturas.add(new AsignaturasModel(2, "Física y química", "¿Qué es Lorem Ipsum?", "ciencias", 8, 12));
		asignaturas.add(new AsignaturasModel(3, "Biología", "¿Qué es Lorem Ipsum?", "ciencias", 7, 24));
		asignaturas.add(new AsignaturasModel(4, "Inglés", "¿Qué es Lorem Ipsum?", "mixto", 3, 19));
		asignaturas.add(new AsignaturasModel(5, "Dibujo Técnico", "¿Qué es Lorem Ipsum?", "ciencias", 10, 16));
		asignaturas.add(new AsignaturasModel(6, "Física y química", "¿Qué es Lorem Ipsum?", "ciencias", 8, 12));
		asignaturas.add(new AsignaturasModel(7, "Matemáticas", "¿Qué es Lorem Ipsum?", "mixto", 5, 32));
		asignaturas.add(new AsignaturasModel(8, "Economía", "¿Qué es Lorem Ipsum?", "sociales", 9, 26));
		asignaturas.add(new AsignaturasModel(9, "Latín", "¿Qué es Lorem Ipsum?", "letras", 4, 10));
		asignaturas.add(new AsignaturasModel(10, "Análisis Musical", "¿Qué es Lorem Ipsum?", "artístico", 11, 35));
		asignaturas.add(new AsignaturasModel(11, "Tecnología e Ingeniería", "¿Qué es Lorem Ipsum?", "ciencias", 7, 15));
		asignaturas.add(new AsignaturasModel(12, "Geología y Ciencas Ambientales", "¿Qué es Lorem Ipsum?", "ciencias", 5, 29));
		asignaturas.add(new AsignaturasModel(13, "Diseño", "¿Qué es Lorem Ipsum?", "artístico", 3, 38));
		asignaturas.add(new AsignaturasModel(14, "Volumen", "¿Qué es Lorem Ipsum?", "artístico", 10, 23));
		asignaturas.add(new AsignaturasModel(15, "Cultura audiovisual", "¿Qué es Lorem Ipsum?", "artístico", 7, 28));
		asignaturas.add(new AsignaturasModel(16, "Geografía", "¿Qué es Lorem Ipsum?", "mixto", 5, 28));
		asignaturas.add(new AsignaturasModel(17, "Griego", "¿Qué es Lorem Ipsum?", "letras", 4, 31));
		asignaturas.add(new AsignaturasModel(18, "Artes Escénicas", "¿Qué es Lorem Ipsum?", "artístico", 9, 25));
		asignaturas.add(new AsignaturasModel(19, "Literatura Universal", "¿Qué es Lorem Ipsum?", "letras", 10, 34));
		asignaturas.add(new AsignaturasModel(20, "Dibujo Artístico", "¿Qué es Lorem Ipsum?", "artístico", 3, 26));
		model.addAttribute("listadoasignaturas", asignaturas);
		return "asignaturas/listadocon";
	}
	
	@GetMapping({"/sin"})
	public String listadoSinAlumnos(Model model){
		List<AsignaturasModel> asignaturas = new ArrayList<>();
		model.addAttribute("titulo", "Listado sin número de alumnos");
		model.addAttribute("cabecera", "Listado sin número de alumnos");
		model.addAttribute("parrafo", "Se mostrará una lista de las asignaturas");
		asignaturas.add(new AsignaturasModel(1, "Lengua", "¿Qué es Lorem Ipsum?", "letras", 4, 15));
		asignaturas.add(new AsignaturasModel(2, "Física y química", "¿Qué es Lorem Ipsum?", "ciencias", 8, 12));
		asignaturas.add(new AsignaturasModel(3, "Biología", "¿Qué es Lorem Ipsum?", "ciencias", 7, 24));
		asignaturas.add(new AsignaturasModel(4, "Inglés", "¿Qué es Lorem Ipsum?", "mixto", 3, 19));
		asignaturas.add(new AsignaturasModel(5, "Dibujo Técnico", "¿Qué es Lorem Ipsum?", "ciencias", 10, 16));
		asignaturas.add(new AsignaturasModel(6, "Física y química", "¿Qué es Lorem Ipsum?", "ciencias", 8, 12));
		asignaturas.add(new AsignaturasModel(7, "Matemáticas", "¿Qué es Lorem Ipsum?", "mixto", 5, 32));
		asignaturas.add(new AsignaturasModel(8, "Economía", "¿Qué es Lorem Ipsum?", "sociales", 9, 26));
		asignaturas.add(new AsignaturasModel(9, "Latín", "¿Qué es Lorem Ipsum?", "letras", 4, 10));
		asignaturas.add(new AsignaturasModel(10, "Análisis Musical", "¿Qué es Lorem Ipsum?", "artístico", 11, 35));
		asignaturas.add(new AsignaturasModel(11, "Tecnología e Ingeniería", "¿Qué es Lorem Ipsum?", "ciencias", 7, 15));
		asignaturas.add(new AsignaturasModel(12, "Geología y Ciencas Ambientales", "¿Qué es Lorem Ipsum?", "ciencias", 5, 29));
		asignaturas.add(new AsignaturasModel(13, "Diseño", "¿Qué es Lorem Ipsum?", "artístico", 3, 38));
		asignaturas.add(new AsignaturasModel(14, "Volumen", "¿Qué es Lorem Ipsum?", "artístico", 10, 23));
		asignaturas.add(new AsignaturasModel(15, "Cultura audiovisual", "¿Qué es Lorem Ipsum?", "artístico", 7, 28));
		asignaturas.add(new AsignaturasModel(16, "Geografía", "¿Qué es Lorem Ipsum?", "mixto", 5, 28));
		asignaturas.add(new AsignaturasModel(17, "Griego", "¿Qué es Lorem Ipsum?", "letras", 4, 31));
		asignaturas.add(new AsignaturasModel(18, "Artes Escénicas", "¿Qué es Lorem Ipsum?", "artístico", 9, 25));
		asignaturas.add(new AsignaturasModel(19, "Literatura Universal", "¿Qué es Lorem Ipsum?", "letras", 10, 34));
		asignaturas.add(new AsignaturasModel(20, "Dibujo Artístico", "¿Qué es Lorem Ipsum?", "artístico", 3, 26));
		model.addAttribute("listadoasignaturas", asignaturas);
		return "asignaturas/listadosin";
	}

	
}
