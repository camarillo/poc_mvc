package mx.ivanaranda.sample.mvc.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import mx.ivanaranda.sample.mvc.entity.Usuario;
import mx.ivanaranda.sample.mvc.service.UsuarioService;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {
	// INICIALIZAR EL LOGGER PARA IMPRIMIR MENSAJES EN LA CONSOLA Y CONTROLARLOS POR DEBUG, ERROR, ETC (COMO System.out)
	private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioController.class);

	// LIBRERIA PARA PARSEAR UN OBJETO EN JSON
	ObjectMapper mapper = new ObjectMapper(); 

	
	@Autowired
	UsuarioService usuarioService;
	
	// GET: ENVIAR DATOS AL FRONT-END
	// POST: RECIBIR DATOS DEL FRONT-END PARA INSERTAR
	// PUT: RECIBIR DATOS DEL FRONT-END PARA ACTUALIZAR
	// DELETE: PARA BORRAR DATOS

	@GetMapping("/lista")
	@ResponseBody
	public List<Usuario> listaUsuarios(){
		return usuarioService.lista();
	}

	// LOS SERVICIOS SE LLAMAN CON EL MISMO MAPEO usuario PERO DIFERENTE METHOD, POR EL METHOD DIFERENCIA LA FUNCION QUE VA A LLAMAR 
	@PostMapping("usuario")
	@ResponseBody
	public Usuario insertarUsuario(@RequestBody Usuario usuario) {
		LOGGER.debug("RECIBIENDO USUARIO PARA INSERTAR: " + usuario);
		return usuarioService.insertarUsuario(usuario);
	}
	
	// @RequestBody Usuario usuario AQUI SE RECIBE UN JSON (CON LA ESTRUCTURA DE LA ENTIDAD) Y AUTO LLENA EL OBJETO usuario
	@PutMapping("usuario") 
	@ResponseBody
	public Usuario actualizarUsuario(@RequestBody Usuario usuario) {
		LOGGER.debug("RECIBIENDO USUARIO PARA ACTUALIZAR" + usuario);
		return usuarioService.actualizarUsuario(usuario);
	}
	
	// El DeleteMapping NO TIENE LA CAPACIDAD DE LLENAR LA ENTIDAD CON EL JSON QUE VIENE EN EL REQUEST	
	@DeleteMapping("usuario")    
	@ResponseBody
	public int eliminarUser(@RequestBody String usuario){
		LOGGER.info("--- Probando LOGGER info");
		LOGGER.debug("ENTRANDO A BORRAR");
		Usuario userEntity = null;
		int statusBorrado = 0;
		try {
			userEntity = mapper.readValue(usuario, Usuario.class);
			statusBorrado = usuarioService.eliminarUsuario(userEntity);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return statusBorrado;
	}

}
