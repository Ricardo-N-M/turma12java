package Aplicacao;

import java.util.Scanner;

import Entidades.Aves;
import Entidades.Cachorro;
import Entidades.Entrega;
import Entidades.Pessoa;

public class PetBet {

	public static void main(String[] args) {
		
		Pessoa cliente1 = new Pessoa("Ricardo", "Magalhães");
		Pessoa cliente2 = new Pessoa("Ednilson");
		
		Entrega entrega1 = new Entrega();
		Cachorro dog1 = new Cachorro("Vira lata");
		Cachorro dog2 = new Cachorro("Pitbull");
		Scanner read = new Scanner(System.in);
		Aves ave1 = new Aves("Verde", "curvado", "Arara");
		
		System.out.println(cliente1.nome);
		System.out.println(cliente1.sobrenome);
		System.out.println("Digite o sobrenome: ");
		cliente1.sobrenome = read.next();
		System.out.println("Digite o ano de nascimento");
		cliente1.anoNascimento = read.nextInt();
		System.out.println(cliente1.nome);
		System.out.println(cliente1.sobrenome);
		cliente1.idade();
		System.out.println(cliente1.idade);
		System.out.println("Informando o ano");
		cliente1.idade(2020);
		System.out.println(cliente1.PegaIdade(2050));
		

	}

}
