package mx.ivanaranda.sample.mvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mx.ivanaranda.sample.mvc.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	public List<User> findBySexo(String sexo);
}
