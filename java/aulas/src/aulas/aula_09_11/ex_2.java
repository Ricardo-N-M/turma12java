package aulas.aula_09_11;

import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int C, N, E, S;
		
		System.out.println("Ol�, quantas horas voc� trabalhou? ");
		N = leia.nextInt();
		if (N>50)
		{
			E=N-50;
			C = (E*20); 
			S = (C+500);
			System.out.printf("Voc� trabalhou "+E+" horas excedentes, o que lhe conferiu um sal�rio de R$"+S+",00 reais, sendo R$"+C+",00 reais o valor em horas extras. Obrigado pelo seu esfor�o.");
			
		}
		else
		{
			S=(N*10);
			System.out.printf("O seu sal�rio esse m�s foi de R$"+S+",00 reais.");
		}

	}

}
