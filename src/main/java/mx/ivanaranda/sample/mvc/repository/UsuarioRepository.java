package mx.ivanaranda.sample.mvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mx.ivanaranda.sample.mvc.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	public List<Usuario> findBySexo(String sexo);
}
