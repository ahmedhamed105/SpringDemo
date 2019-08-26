package gru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gru.springframework.sfgpetclinic.services.VetService;

@Controller
public class VetController {
	
	private final VetService vetservice;

	
	public VetController(VetService vetservice) {
		this.vetservice = vetservice;
	}




	@RequestMapping({"/vets","/vets/index","/vets/index.html"})
	public String ListVets(Model model) {
		
		model.addAttribute("vets",vetservice.findAll());
		return "vets/index";
	}

}
