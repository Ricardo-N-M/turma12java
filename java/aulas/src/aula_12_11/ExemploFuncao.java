package aula_12_11;

import java.util.Scanner;

public class ExemploFuncao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero ; 
		
		System.out.println("Leia um número inteiro: ");
		numero=leia.nextInt();
		parImpar(numero);
		linha(numero);
		System.out.println();
		linha(numero/2);
		System.out.println();
		linha(numero*2);
		System.out.println();
		
		
	}
	public static void parImpar(int valor) {
		if ((valor%2)==0)
		{
			System.out.println("NÚMERO PAR.");
		}
		else
		{
			System.out.println("NÚMERO ÍMPAR.");
		}
	}
	public static void linha(int tamanho)
	{
		for (int x=0;x< tamanho;x++)
		{
			System.out.print("-");
		}
	}
}
