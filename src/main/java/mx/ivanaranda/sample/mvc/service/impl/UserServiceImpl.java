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
	public boolean eliminarUsuario(Usuario usuario) {
		repository.delete(usuario);
		return !repository.existsById(usuario.getId());
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
