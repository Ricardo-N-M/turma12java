package aula_12_11;

import java.util.Scanner;

public class ForEachVetor {
	public static void main (String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int notas[] = new int[4];
		int indice = 0;
		
		System.out.println("CADASTRANDO NO VETOR");
		for (int valor : notas)
		{
			System.out.println("Digite a nota "+(indice+1));
			notas[indice] = leia.nextInt();
			indice++;
		}
		for (int valor : notas)
		{
			System.out.println(valor);
			System.out.println();
		}
	}

}
