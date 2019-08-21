package gru.springframework.sfgpetclinic.services;

import gru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String LastName);
	
}
