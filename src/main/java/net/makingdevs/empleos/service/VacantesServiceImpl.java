package net.makingdevs.empleos.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.makingdevs.empleos.model.Vacante;

@Service
public class VacantesServiceImpl implements IVacantesService{
	
	private List<Vacante> lista = null;
	
	public VacantesServiceImpl() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		lista = new LinkedList<Vacante>();
		try {
			// Oferta de trabajo 1
			Vacante vacante1 = new Vacante();
			vacante1.setId(1);
			vacante1.setNombre("Ingeniero en Sistemas");
			vacante1.setDescripcion("Se solicita ingeniero para desarrollar software");
			vacante1.setFecha(sdf.parse("20-10-2021"));
			vacante1.setSalario(35000.0);
			vacante1.setDestacado(1);
			vacante1.setImagen("empresa1.png");
			
			// Oferta de trabajo 2
			Vacante vacante2 = new Vacante();
			vacante2.setId(2);
			vacante2.setNombre("Técnico en TI");
			vacante2.setDescripcion("Se solicita técnico para reparar equipos");
			vacante2.setFecha(sdf.parse("21-10-2021"));
			vacante2.setSalario(15000.0);
			vacante2.setDestacado(0);
			vacante2.setImagen("empresa2.png");
			
			// Oferta de trabajo 3
			Vacante vacante3 = new Vacante();
			vacante3.setId(3);
			vacante3.setNombre("Developer");
			vacante3.setDescripcion("Se solicita ingeniero para desarrollar software");
			vacante3.setFecha(sdf.parse("22-10-2021"));
			vacante3.setSalario(20000.0);
			vacante3.setDestacado(0);
			
			// Oferta de trabajo 1
			Vacante vacante4 = new Vacante();
			vacante4.setId(4);
			vacante4.setNombre("Ingeniero en Robótica");
			vacante4.setDescripcion("Se solicita ingeniero para construir circuitos");
			vacante4.setFecha(sdf.parse("23-10-2021"));
			vacante4.setSalario(35000.0);
			vacante4.setDestacado(1);
			vacante4.setImagen("empresa3.png");
			
			lista.add(vacante1);
			lista.add(vacante2);
			lista.add(vacante3);
			lista.add(vacante4);
			
		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public List<Vacante> buscarTodas() {
		return lista;
	}

	@Override
	public Vacante buscarporId(Integer idVacante) {
		for (Vacante v : lista) {
			if (v.getId()==idVacante) {
				return v;
			}
		}
		return null;
	}

}
