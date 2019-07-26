package mx.ivanaranda.sample.mvc.service;

import java.util.List;

import mx.ivanaranda.sample.mvc.entity.Seccion;

public interface SeccionService {
	public Seccion insertarSeccion(Seccion seccion);
	public Seccion actualizarSeccion(Seccion seccion);
	public List<Seccion> lista();
}
