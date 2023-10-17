package com.midominio.evaluable2.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midominio.evaluable2.app.model.Libros;

@Controller
@RequestMapping("/datos")
public class LibrosController {
	
	@GetMapping("/libros")
	public String listadoLibros(Model model) {
		List<Libros>libros = new ArrayList<>();
		model.addAttribute("titulo", "Libros");
		model.addAttribute("cabecera", "Lista de libros");
		model.addAttribute("parrafo", "A continuacion se mostrara la lista de libros disponibles:");
		libros.add(new Libros(1, "Cien años de soledad", "Gabriel García Márquez"));
		libros.add(new Libros(2, "1984", " George Orwell"));
		libros.add(new Libros(3, "Matar un ruiseñor", "Harper Lee"));
		libros.add(new Libros(4, "Don Quijote de la Mancha", "Miguel de Cervantes"));
		libros.add(new Libros(5, "Harry Potter y la piedra filosofal", " J.K. Rowling"));
		libros.add(new Libros(6, "El Gran Gatsby", "F. Scott Fitzgerald"));
		libros.add(new Libros(7, "Crimen y castigo"," Fyodor Dostoevsky"));
		libros.add(new Libros(8, "En busca del tiempo perdido", "Marcel Proust"));
		libros.add(new Libros(9,"El Hobbit", "J.R.R. Tolkien"));
		libros.add(new Libros(10, "Los juegos del hambre", "Suzanne Collins"));
		libros.add(new Libros(11, "Moby-Dick", "Herman Melville"));
		libros.add(new Libros(12, "Ulises", "James Joyce"));
		libros.add(new Libros(13, "Crimen en la calle Morgue", "Edgar Allan Poe"));
		libros.add(new Libros(14, "Anna Karenina", " León Tolstói"));
		libros.add(new Libros(15, "El corazón de las tinieblas", "Joseph Conrad"));
		libros.add(new Libros(16, "Las aventuras de Sherlock Holmes", "Arthur Conan Doyle"));
		libros.add(new Libros(17, "El retrato de Dorian Gray", "Oscar Wilde"));
		libros.add(new Libros(18, "Orgullo y prejuicio", "Jane Austen"));
		libros.add(new Libros(19, "El guardián entre el centeno", "J.D. Salinger"));
		model.addAttribute("listadoLibros", libros);
		return"datos/libros";
	}
}
