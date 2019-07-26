package mx.ivanaranda.sample.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ivanaranda.sample.mvc.entity.Seccion;
import mx.ivanaranda.sample.mvc.repository.SeccionRepository;
import mx.ivanaranda.sample.mvc.service.SeccionService;

@Service("seccionService")
public class SeccionServiceImpl implements SeccionService{

	@Autowired
	SeccionRepository seccionRepository;
	
	@Override
	public Seccion insertarSeccion(Seccion seccion) {
		// TODO Auto-generated method stub
		return seccionRepository.save(seccion);
	}

	@Override
	public Seccion actualizarSeccion(Seccion seccion) {
		// TODO Auto-generated method stub
		return seccionRepository.save(seccion);
	}

	@Override
	public List<Seccion> lista() {
		// TODO Auto-generated method stub
		return (List<Seccion>) seccionRepository.findAll();
	}
	
}
