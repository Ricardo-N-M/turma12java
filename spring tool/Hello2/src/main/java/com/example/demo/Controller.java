package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello2")
public class Controller {
	@GetMapping
	public String Hello1()
	{
		return "Essa semana espero entender melhor o STS pois ainda estou um pouco perdido e quem sabe avançar mais um pouco no projeto integrador.";
	}

}
