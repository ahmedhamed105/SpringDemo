package gru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import gru.springframework.sfgpetclinic.model.Pet;
import gru.springframework.sfgpetclinic.model.Vet;
import gru.springframework.sfgpetclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>{

	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		
		super.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

}