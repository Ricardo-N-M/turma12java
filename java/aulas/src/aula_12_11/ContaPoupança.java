package aula_12_11;

import java.util.Random;
import java.util.Scanner;

public class ContaPoupan�a {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner leia = new Scanner(System.in);
		
		double saldo=0;
		int talao,conta;
		int CPF;
		char opcao;
		int valor=0;
		int maximo=0;
		char aniversario;		
		
		System.out.print("Digite o n�mero da conta: ");
		conta = leia.nextInt();
		System.out.print("Digite o n�mero da cpf somente com n�meros: ");
		CPF = leia.nextInt();	
		
		System.out.printf("SALDO : R$%.2f",saldo);		
		do
		{
			maximo++;
			System.out.print("\nDIGITE C PARA CR�DITO OU D PARA D�BITO : ");
			opcao = leia.next().toUpperCase().charAt(0);
			System.out.println();
			if (opcao == 'C')
			{
				System.out.printf("Gostaria de creditar qual valor?");
				valor = leia.nextInt();
				saldo = saldo+valor;
				System.out.printf("SALDO : R$%.2f",saldo);
			}
			else if(opcao == 'D')
			{
				System.out.printf("Gostaria de debitar qual valor?");
				valor = leia.nextInt();
				if (valor > saldo)
				{
					System.out.printf("Saldo insuficiente, limite de transa��es inalterado");
					maximo--;
				}
				else 
				{
					
					saldo = saldo-valor;
				System.out.printf("SALDO : R$%.2f",saldo);
				}
			}
			
			
			
		}while (maximo<5);
		System.out.println("Hoje � o anivers�rio da conta?");
		aniversario = leia.next().toUpperCase().charAt(0);
		if (aniversario == 'S')
		{
			saldo = saldo+(saldo/200);
		}
		System.out.printf("\nO seu saldo � de R$%.2f",saldo);
		
	}

}
creditoslim
creditolimite
