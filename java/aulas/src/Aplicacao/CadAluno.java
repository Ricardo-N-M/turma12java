package Aplicacao;

import java.util.Scanner;

import Entidades.Disciplina;
import Entidades.Pessoa;

public class CadAluno {

	public static void main(String[] args) {
		Disciplina curso = new Disciplina ();
		Pessoa aluno = new Pessoa();
		Scanner leia = new Scanner(System.in);
		byte escolha = 0;
		
		System.out.println("SISTEMA DE CADASTRO DE ALUNOS POR MATÉRIA");
		System.out.println("Digite o nome do aluno: ");
		aluno.nome=leia.next();
		System.out.println("Digite o gênero (masculino, feminino, outros)");
		aluno.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Escolha 1 para java ou 2 para sql: ");
		escolha = leia.nextByte();
		if (escolha == 1)
		{
			curso.nome = "java";
		}
		else if(escolha == 2)
		{
			curso.nome = "sql";
		}
		
		
		
		
		
		}

}
