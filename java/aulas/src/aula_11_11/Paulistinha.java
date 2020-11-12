package aula_11_11;

import java.util.Scanner;

public class Paulistinha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String times[] = { "COR", "PAL", "SAN", "SP" };
		int pontos[][] = new int[4][4];
		int soma[]= new int[4];
		int linha = 0, coluna = 0;
		char resultado  ;

		for (linha = 0; linha < 4; linha++) 
		{
			System.out.printf("RODADA "+(linha+1)+"\n");
			for (coluna = 0; coluna < 4; coluna++) 
			{
				System.out.printf("\n O time %s ganhou, empatou ou perdeu? ", times[coluna]);
				resultado = leia.next().toUpperCase().charAt(0);
				if (resultado == 'G') {
					pontos[linha][coluna] = 3 ;
				} else if (resultado == 'E') {
					pontos[linha][coluna]++;
				} else if (resultado == 'P') {
				;
				} else {
					System.out.print("\nResposta inválida.");
				}
				soma[coluna] = soma[coluna] + pontos[linha][coluna];
			}
		}
		
		for (linha = 0 ; linha<4;linha++)
		{
			System.out.printf(times[linha]+"\t");
		}
		System.out.printf("\n");
		System.out.println();
		for (linha = 0 ; linha<4;linha++)
		{
			for (coluna = 0 ; coluna<4;coluna++)
			{
				System.out.printf(pontos[linha][coluna]+"\t");
			}
			System.out.printf("\n");
		}
		System.out.printf("SOMA TOTAL DE PONTOS: \n");
		for (coluna = 0 ; coluna<4;coluna++)
		{
			System.out.print(soma[coluna]+"\t");
		}
	}

}
