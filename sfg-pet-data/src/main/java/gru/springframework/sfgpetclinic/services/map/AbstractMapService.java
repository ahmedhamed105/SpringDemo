package gru.springframework.sfgpetclinic.services.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

import gru.springframework.sfgpetclinic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {
	
	protected Map<ID, T> map=new HashMap<>();
	
	Set<T> findAll(){	
		return new HashSet<>(map.values());
	}
	
	
	T findById(ID id){	
		return map.get(id);
	}
	
	
	T save(T object){	
		if(object != null) {
			if(object.getId() == null) {
				object.setId(getnextId());
				
			}
			map.put((ID) object.getId(), object);
		}else {
			throw new RuntimeException("object not be null");
		}
		
		return object;
	}
	
	void deleteById(ID id){	
		map.remove(id);
	}
	
	void delete(T object){	
		map.entrySet().removeIf(Entry -> Entry.getValue().equals(object));
	}
	
	
	private Long getnextId() {
		Long nextid= null;
		try {
			nextid=	Collections.max(map.keySet())+1;
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			nextid=1L;
		}
		return nextid;
		
	}


}
