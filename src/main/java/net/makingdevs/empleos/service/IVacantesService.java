package net.makingdevs.empleos.service;

import java.util.List;

import net.makingdevs.empleos.model.Vacante;

public interface IVacantesService {
	
	List<Vacante> buscarTodas();
	Vacante buscarporId(Integer idVacante);
}
