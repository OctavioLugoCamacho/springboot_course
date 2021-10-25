package net.makingdevs.empleos.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.makingdevs.empleos.model.Vacante;
import net.makingdevs.empleos.service.IVacantesService;

@Controller
public class HomeController {
	
	@Autowired
	private IVacantesService serviceVacantes;
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<Vacante> lista = serviceVacantes.buscarTodas();
		model.addAttribute("vacantes", lista);
		return "tabla";
	}
	
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model){
		Vacante vacante = new Vacante();
		vacante.setNombre("Ingeniero en Sistemas");
		vacante.setDescripcion("Se solicita ingeniero para desarrollar software");
		vacante.setFecha(new Date());
		vacante.setSalario(100000.0);
		model.addAttribute("vacante", vacante);
		return "detalle";
	}
	
	@GetMapping("/listado")
	public String mostrarlistado(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("Ingeniero en sistemas");
		lista.add("Soporte técnico");
		lista.add("Repartidor");
		lista.add("Vendedor");
		
		model.addAttribute("empleos", lista);
		
		return "listado";
	}
	
	@GetMapping("/")
	public String mostrarHome(Model model) {
		/*
		model.addAttribute("mensaje","Bienvenido a EmpleosApp");
		model.addAttribute("fecha", new Date());
		*/
		
		String nombre = "Developer";
		Date fechaPub = new Date();
		double salario = 15000.0;
		boolean vigente = true;
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("fecha", fechaPub);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);
		
		return "home";
	}
}
