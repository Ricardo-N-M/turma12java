package aulas.aula_10_11;

import java.util.Scanner;

//1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
	//coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
	//a) média do salário da população; RESOLVIDO
	//b) média do número de filhos; RESOLVIDO
	//c) maior salário; RESOLVIDO
  	//d) percentual de pessoas com salário até R$100,00. 

public class EX_1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double mediaSalario = 0,salario = 0,totSalario = 0, mediaFilho = 0,maiorSalario = 0,percentualSalario100 = 0;
		int filho = 0, totFilho = 0,baixoSalario = 0;
		
		for (int x = 0; x<20; x++)
		{
			System.out.print("\nOlá, qual é o seu salário? ");
			salario = read.nextDouble();
			if (salario>=0)
			{
				totSalario = totSalario + salario;
			}
			else
			{
				System.out.print("Valor inválido.\n");
			}
			if (salario > maiorSalario)
			{
				maiorSalario = salario ;
			}
			if (salario <= 100)
			{
				baixoSalario++;
			}
			System.out.print("\nQuantos filhos você tem? ");
			filho = read.nextInt();
			if (filho>=0)
			{
				totFilho = totFilho + filho;
			}
			else
			{
				System.out.print("Valor inválido.\n");
			}
			
		}
		mediaFilho = (totFilho/20);
		mediaSalario = (totSalario/20);
		percentualSalario100 = (baixoSalario*5);
		
		System.out.printf("De 20 pessoas entrevistadas nessa pesquisa a média salarial foi de R$%.2f , a média de filhos foi de %.1f filhos, o maior salário foi de R$%.2f e o percentual de pessoas com salário de até R$100,00 foi de %.2f ",mediaSalario,mediaFilho,maiorSalario,percentualSalario100);
	}

}
