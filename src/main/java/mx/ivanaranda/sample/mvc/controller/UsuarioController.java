package mx.ivanaranda.sample.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.ivanaranda.sample.mvc.entity.Usuario;
import mx.ivanaranda.sample.mvc.service.UsuarioService;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService userService;
	
	// GET: ENVIAR DATOS AL FRONT-END
	// POST: RECIBIR DATOS DEL FRONT-END PARA INSERTAR
	// PUT: RECIBIR DATOS DEL FRONT-END PARA ACTUALIZAR
	// DELETE: PARA BORRAR DATOS

	@GetMapping("/lista")
	@ResponseBody
	public List<Usuario> listaUsuarios(){
		return userService.lista();
	}
	
	
}
