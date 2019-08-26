package gru.springframework.sfgpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import gru.springframework.sfgpetclinic.model.Owner;
import gru.springframework.sfgpetclinic.model.Vet;
import gru.springframework.sfgpetclinic.services.OwnerService;
import gru.springframework.sfgpetclinic.services.VetService;
import gru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import gru.springframework.sfgpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner{
	
	private final OwnerService ownerservice;
	private final VetService vetservice;


	@Autowired
	public DataLoader(OwnerService ownerservice, VetService vetservice) {
		super();
		this.ownerservice = ownerservice;
		this.vetservice = vetservice;
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Owner owner1= new Owner();
		//owner1.setId(1L);
		owner1.setFirstname("ahmed");
		owner1.setLastname("hamed");
		ownerservice.save(owner1);
		
		
		Owner owner2= new Owner();
		//owner2.setId(2L);
		owner2.setFirstname("mohamed");
		owner2.setLastname("said");
		ownerservice.save(owner2);
		
		
		System.out.println("Loading Owners ......");
		
		
		Vet vet1=new Vet();
		//vet1.setId(1L);
		vet1.setFirstname("vert");
		vet1.setLastname("AXE");
		vetservice.save(vet1);
		
		
		Vet vet2=new Vet();
		//vet2.setId(2L);
		vet2.setFirstname("DESS");
		vet2.setLastname("CVV");
		vetservice.save(vet2);
		
		
		System.out.println("Loading Vet ......");
		
		
		
	}

}
