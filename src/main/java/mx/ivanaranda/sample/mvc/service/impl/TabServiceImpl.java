package mx.ivanaranda.sample.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ivanaranda.sample.mvc.entity.Tab;
import mx.ivanaranda.sample.mvc.repository.TabRepository;
import mx.ivanaranda.sample.mvc.service.TabService;

@Service("tabService")
public class TabServiceImpl implements TabService{

	@Autowired
	TabRepository tabRepository;
	
	@Override
	public Tab insertarTab(Tab tab) {
		// TODO Auto-generated method stub
		return tabRepository.save(tab);
	}

	@Override
	public Tab actualizarTab(Tab tab) {
		// TODO Auto-generated method stub
		return tabRepository.save(tab);
	}

	@Override
	public List<Tab> lista() {
		// TODO Auto-generated method stub
		return (List<Tab>) tabRepository.findAll();
	}

}
