package mx.ivanaranda.sample.mvc.service;

import java.util.List;

import mx.ivanaranda.sample.mvc.entity.Tab;

public interface TabService {
	public Tab insertarTab(Tab tab);
	public Tab actualizarTab(Tab tab);
	public List<Tab> lista();
	
}	
