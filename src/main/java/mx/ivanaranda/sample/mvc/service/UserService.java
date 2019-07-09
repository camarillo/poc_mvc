package mx.ivanaranda.sample.mvc.service;

import java.util.List;

import mx.ivanaranda.sample.mvc.entity.User;


public interface UserService {
	// AQUI SE REALIZAN TODAS LAS FUNCIONES QUE SE TIENEN QUE DESARROLLAR 
	
	/**
	 * FUNCION QUE INSERTA UN USUARIO EN LA BD
	 * @param User
	 * @return User
	 */
	public User insertarUser(User user);
	
	/**
	 * ACTUAIZAR UN USUARIO
	 * @param user
	 * @return
	 */
	public User actualizarUser(User user);
	
	/**
	 * ELIMINAR UN USUARIO
	 * @param user
	 * @return
	 */
	public boolean eliminarUser(User user);
	
	/**
	 * REGRESA UNA LISTA DE TODOS LOS USUARIOS
	 * @return
	 */
	public List<User> ver();
	
	/**
	 * REGRESA UNA LISTA DE USUARIOS FILTRADOS POR SEXO
	 * @param sexo
	 * @return
	 */
	public List<User> verPorSexo(String sexo);
	
}
