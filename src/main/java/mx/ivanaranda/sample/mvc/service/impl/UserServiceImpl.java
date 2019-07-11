package mx.ivanaranda.sample.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ivanaranda.sample.mvc.entity.Usuario;
import mx.ivanaranda.sample.mvc.repository.UsuarioRepository;
import mx.ivanaranda.sample.mvc.service.UsuarioService;

@Service("userService") // NOMBRE PARA EL USER SERVICE
public class UserServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository repository;

	@Override
	public Usuario insertarUsuario(Usuario usuario) {
		return repository.save(usuario);
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		return repository.save(usuario);
	}

	@Override
	public int eliminarUsuario(Usuario usuario) {
		int statusBorrado = 0; // NO EXISTE EL REGISTRO
		if (repository.existsById(usuario.getId())) {
			repository.delete(usuario);
			if (repository.existsById(usuario.getId())) {
				statusBorrado = 2; // PROBLEMA AL BORRAR
			} else {
				statusBorrado = 1; // BORRADO EXITOSO
			}
		}
		return statusBorrado;
	}

	@Override
	public List<Usuario> lista() {
		return (List<Usuario>) repository.findAll();
	}

	@Override
	public List<Usuario> listaPorSexo(String sexo) {
		return repository.findBySexo(sexo);
	}

}
