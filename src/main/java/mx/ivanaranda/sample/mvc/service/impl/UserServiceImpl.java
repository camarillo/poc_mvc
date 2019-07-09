package mx.ivanaranda.sample.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ivanaranda.sample.mvc.entity.User;
import mx.ivanaranda.sample.mvc.repository.UserRepository;
import mx.ivanaranda.sample.mvc.service.UserService;

@Service("userService") // NOMBRE PARA EL USER SERVICE
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;

	@Override
	public User insertarUser(User user) {
		return repository.save(user);
	}

	@Override
	public User actualizarUser(User user) {
		return repository.save(user);
	}

	@Override
	public boolean eliminarUser(User user) {
		repository.delete(user);
		return !repository.existsById(user.getId());
	}

	@Override
	public List<User> ver() {
		return (List<User>) repository.findAll();
	}

	@Override
	public List<User> verPorSexo(String sexo) {
		return repository.findBySexo(sexo);
	}

}
