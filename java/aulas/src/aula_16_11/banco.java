package aula_16_11;

import java.util.Random;
import java.util.Scanner;

public class banco {

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
		String dadosCliente;
		char confirma;
		
		System.out.println("Digite o seu cpf/cnpj: ");
		dadosCliente = leia.next();
		if (dadosCliente.length() == 11)
		{
			do
			{
			System.out.print("\nCPF = "+dadosCliente+" Confirma?");
			confirma = leia.next().toUpperCase().charAt(0);
			} while (confirma = 'N')
		} else if (dadosCliente.length() == 14)
		{
			do
			{
			System.out.print("\nCNPJ = "+dadosCliente+" Confirma?");
			confirma = leia.next().toUpperCase().charAt(0);
			} while (confirma = 'N')
				
		}
		

	}


public static void creditoSemLimite ()
{
	Random random = new Random();
	Scanner leia = new Scanner(System.in);
	
	double saldo=0;
	int talao,conta;
	int CPF;
	char opcao;
	int valor=0;
	int maximo=0;
	char aniversario;	
	
	System.out.printf("SALDO : R$%.2f",saldo);		
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
			System.out.printf("Gostaria de debitar qual valor?");
			valor = leia.nextInt();
			if (valor > saldo)
			{
				System.out.printf("Saldo insuficiente, limite de transações inalterado");
				maximo--;
			}
			else 
			{
				
				saldo = saldo-valor;
			System.out.printf("SALDO : R$%.2f",saldo);
			}
		}
		
		
		
	}while (maximo<5);
}
}
