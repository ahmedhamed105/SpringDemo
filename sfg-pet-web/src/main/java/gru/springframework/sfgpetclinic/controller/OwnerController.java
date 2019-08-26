package gru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gru.springframework.sfgpetclinic.services.OwnerService;
@RequestMapping("/owners")
@Controller
public class OwnerController {
	
	private final OwnerService ownerservice;
	
	
	
	
	public OwnerController(OwnerService ownerservice) {
		this.ownerservice = ownerservice;
	}




	@RequestMapping({"","/","/index","/index.html"})
	public String ListVets(Model model) {
		
		model.addAttribute("owners",ownerservice.findAll());
		
		return "owners/index";
	}

}
