package mx.ivanaranda.sample.mvc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.ivanaranda.sample.mvc.entity.Tab;
import mx.ivanaranda.sample.mvc.service.TabService;

@RestController
@RequestMapping(path = "/tab")
public class TabController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	TabService tabService;
	
	@RequestMapping(value="/insertar", method = RequestMethod.POST, consumes="application/json", produces="application/json")
	public Tab insertarUsuario(@RequestBody Tab tab) {
		return tabService.insertarTab(tab);
	}
	
	@RequestMapping(value="/lista", method=RequestMethod.POST, consumes="application/json", produces="application/json")
	public List<Tab> lista(){
		return tabService.lista();
	}
}
