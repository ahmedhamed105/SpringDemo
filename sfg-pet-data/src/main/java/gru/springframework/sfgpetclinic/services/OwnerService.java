package gru.springframework.sfgpetclinic.services;

import java.util.Set;

import gru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService {
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();

}
