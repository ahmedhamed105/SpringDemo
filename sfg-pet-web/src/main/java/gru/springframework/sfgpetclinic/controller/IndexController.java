package gru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	
	@RequestMapping({"","/","Index","Index.html"})
	public String index() {
		
		return "Index";
		
	}

}
