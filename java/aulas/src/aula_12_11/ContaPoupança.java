package aula_12_11;

import java.util.Random;
import java.util.Scanner;

public class ContaPoupança {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner leia = new Scanner(System.in);
		
		double saldo=0;
		int talao,conta;
		int CPF;
		char opcao;
		int valor=0;
		int maximo=0;
		
		
		
		
		System.out.print("Digite o número da conta: ");
		conta = leia.nextInt();
		System.out.print("Digite o número da cpf somente com números: ");
		CPF = leia.nextInt();	
		
		do
		{
			maximo++;
			System.out.print("\nDIGITE C PARA CRÉDITO OU D PARA DÉBITO : ");
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
				if (saldo<0)
				{
					System.out.printf("Saldo insuficiente, limite de transações inalterado");
					maximo--;
				}
				else 
				{
					System.out.printf("Gostaria de debitar qual valor?");
					valor = leia.nextInt();
					saldo = saldo-valor;
				System.out.printf("SALDO : R$%.2f",saldo);
				}
			}
			
			
			
		}while (maximo<10);
		System.out.printf("\nO seu saldo é de R$%.2f",saldo);
		
	}

}
