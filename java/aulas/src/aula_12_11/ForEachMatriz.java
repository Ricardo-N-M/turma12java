package aula_12_11;

import java.util.Scanner;

public class ForEachMatriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int matriz[][] = new int [2][2];
		
		for (int x= 0; x<2;x++)
		{
			for (int y = 0; y<2;y++)
			{
				System.out.print("DIGITE O VALOR DE "+x+" - "+y+" : ");
				matriz[x][y] = leia.nextInt();
			}
		}
		for (int x= 0; x<2;x++)
		{
			for (int y = 0; y<2;y++)
			{
				System.out.print(matriz[x][y]);
				System.out.printf("\t");
				}
			System.out.println();
		}
		System.out.println();
		for(int abab[] : matriz)
		{
			for( int valor: abab)
			{
				System.out.print(valor);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
