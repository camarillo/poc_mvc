package mx.ivanaranda.sample.mvc.service;

import java.util.List;

import mx.ivanaranda.sample.mvc.entity.Usuario;


public interface UsuarioService {
	// AQUI SE REALIZAN TODAS LAS FUNCIONES QUE SE TIENEN QUE DESARROLLAR 
	
	/**
	 * FUNCION QUE INSERTA UN USUARIO EN LA BD
	 * @param Usuario
	 * @return User
	 */
	public Usuario insertarUsuario(Usuario user);
	
	/**
	 * ACTUAIZAR UN USUARIO
	 * @param user
	 * @return
	 */
	public Usuario actualizarUsuario(Usuario user);
	
	/**
	 * ELIMINAR UN USUARIO
	 * @param user
	 * @return
	 */
	public boolean eliminarUsuario(Usuario user);
	
	/**
	 * REGRESA UNA LISTA DE TODOS LOS USUARIOS
	 * @return
	 */
	public List<Usuario> lista();
	
	/**
	 * REGRESA UNA LISTA DE USUARIOS FILTRADOS POR SEXO
	 * @param sexo
	 * @return
	 */
	public List<Usuario> listaPorSexo(String sexo);
	
}
