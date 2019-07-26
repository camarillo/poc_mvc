package mx.ivanaranda.sample.mvc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.ivanaranda.sample.mvc.entity.Seccion;
import mx.ivanaranda.sample.mvc.service.SeccionService;

@RestController
@RequestMapping(path="/seccion")
public class SeccionController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioController.class);

	@Autowired
	SeccionService seccionService;
	
	@RequestMapping(path="/insertar", method=RequestMethod.POST, consumes="application/json", produces="application/json")
	public Seccion insertarSeccion(@RequestBody Seccion seccion) {
		return seccionService.insertarSeccion(seccion);
	}
	
	@RequestMapping(path="/lista", method=RequestMethod.POST, consumes="application/json", produces="application/json")
	public List<Seccion> lista(){
		return seccionService.lista();
	}
	
	
}
