package gru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import gru.springframework.sfgpetclinic.model.Owner;
import gru.springframework.sfgpetclinic.services.OwnerService;


@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long>  implements OwnerService{

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub	
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String LastName) {
		// TODO Auto-generated method stub
		return null;
	}



}
