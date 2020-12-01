package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello1")
public class Controller {
	@GetMapping
	public String Hello1()
	{
		return "Usei as habilidade de atenção aos detalhes e a mentalidades de orientação ao futuro.";
	}

}
