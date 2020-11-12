package aulas.aula_10_11;

import java.util.Scanner;

//1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
	//coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:  
	//a) m�dia do sal�rio da popula��o; RESOLVIDO
	//b) m�dia do n�mero de filhos; RESOLVIDO
	//c) maior sal�rio; RESOLVIDO
  	//d) percentual de pessoas com sal�rio at� R$100,00. 

public class EX_1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double mediaSalario = 0,salario = 0,totSalario = 0, mediaFilho = 0,maiorSalario = 0,percentualSalario100 = 0;
		int filho = 0, totFilho = 0,baixoSalario = 0;
		
		for (int x = 0; x<20; x++)
		{
			System.out.print("\nOl�, qual � o seu sal�rio? ");
			salario = read.nextDouble();
			if (salario>=0)
			{
				totSalario = totSalario + salario;
			}
			else
			{
				System.out.print("Valor inv�lido.\n");
			}
			if (salario > maiorSalario)
			{
				maiorSalario = salario ;
			}
			if (salario <= 100)
			{
				baixoSalario++;
			}
			System.out.print("\nQuantos filhos voc� tem? ");
			filho = read.nextInt();
			if (filho>=0)
			{
				totFilho = totFilho + filho;
			}
			else
			{
				System.out.print("Valor inv�lido.\n");
			}
			
		}
		mediaFilho = (totFilho/20);
		mediaSalario = (totSalario/20);
		percentualSalario100 = (baixoSalario*5);
		
		System.out.printf("De 20 pessoas entrevistadas nessa pesquisa a m�dia salarial foi de R$%.2f , a m�dia de filhos foi de %.1f filhos, o maior sal�rio foi de R$%.2f e o percentual de pessoas com sal�rio de at� R$100,00 foi de %.2f ",mediaSalario,mediaFilho,maiorSalario,percentualSalario100);
	}

}
