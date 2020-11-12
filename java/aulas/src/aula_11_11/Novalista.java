package aula_11_11;

import java.util.Locale;
import java.util.Scanner;

public class Novalista {

	public static void main(String[] args) {
		// lista de aluno
		// mostrar essa lista
		// dar nota pra alguns alunos
		// alunos precisam ter matrícula
		// nota
		// vetor
		// listar todos os alunos e depois mostrar todos os alunos com nota
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String alunos[] = { "Ana V. N. Cruz" , "Bruno E. Vicente","Bruno H. M. Santos", "Daniel Ferreira", "Dayane De Oliveira", "Denis V. B. Da Silva", "Diego J. Silva", "Erick Alan","Everson Silva", "Gabriel H. C. Silva" ,"Guilherme Alex" , "Guilherme F. Pereira", "Gustavo M. L. Santana", "Isac C. De Oliveira", "Iuri G. Nunes", "Jenifer L. Placido", "Jessica Cristiane", "João P. Sena", "Larissa M. Ribeiro", "Leonardo De M. Magalhães", "Lucas S. Gonçalves", "MARIANA DE CASSIA ANTUNES OLIVEIRA", "PATRICIA DA SILVA MACHADO", "PAULA LETICIA", "RAUL FERNANDES", "RICARDO MAGALHAES RIBEIRO FINKELSTEIN", "THIAGO DOS ANJOS", "VITORIA GONÇALVES DE FREITAS", "WILLIAM XAVIER"};
		int notas [] = new int [29];
		String matriculas[] = new String[29];
		String matricula;
		int indice;
		
		for (int numeroDeDentro = 0; numeroDeDentro < 29; numeroDeDentro++)
		{
			if(numeroDeDentro < 9)
			{
				matriculas[numeroDeDentro] = "MAT-0"+(numeroDeDentro+1);
			}
			else
			{
				matriculas[numeroDeDentro] = "MAT-"+(numeroDeDentro+1);
			}
			System.out.println(matriculas[numeroDeDentro]+"\t"+alunos[numeroDeDentro]);
		}
		
		System.out.print("\nDigite a matrícula do aluno: ");
		matricula = leia.next().toUpperCase();
		
		for(int numeroDeDentro = 0; numeroDeDentro < 29; numeroDeDentro++)
		{
			if(matricula.equals(matriculas[numeroDeDentro]))
			{
				indice = numeroDeDentro;
				System.out.print("Digite a nota do aluno: ");
				notas[indice] = leia.nextInt();
				System.out.println(matriculas[numeroDeDentro]+"\t"+alunos[numeroDeDentro]+"\t\t\t"+notas[indice]);
				
			}
		
		}
		
		
		
	}

}
