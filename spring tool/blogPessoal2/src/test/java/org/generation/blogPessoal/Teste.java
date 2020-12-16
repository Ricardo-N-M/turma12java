package org.generation.blogPessoal;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
public class Teste {

	@Test 	
	public void Addtest() {
	Calculadora junit= new Calculadora();

	int result= junit.soma(100, 200);

	assertEquals(300, result);}}


