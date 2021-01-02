package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	//Get: consultar información en el servidor
	
	@GetMapping({"/index", "/", "/home"}) //http://localhost:8080/index
	public String index() {
		
		return "index"; //carga la vista index
		
	}
	
}