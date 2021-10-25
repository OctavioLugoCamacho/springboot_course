package net.makingdevs.empleos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/categorias")
public class CategoriasController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String mostrarIndex(Model model) {
		return "categorias/listCategorias";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String crear() {
		return "categorias/formCategoria";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String guardar(@RequestParam("nombre") String nombre,@RequestParam("descripcion") String descripcion) {
		System.out.println("Categoría: " + nombre);
		System.out.println("Descripción: " + descripcion);
		return "categorias/listCategorias";
	}

}
