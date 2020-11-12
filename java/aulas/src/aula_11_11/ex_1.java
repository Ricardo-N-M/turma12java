package aula_11_11;

import java.util.Scanner;

public class ex_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int pontuacao[]= new int[5]; 
		int mP = 0;
		
		for( int x=0 ; x<5; x++)
		{
			System.out.printf("digite um valor: ");
			pontuacao[x] = leia.nextInt();
			if(pontuacao[x] > mP)
			{
				mP = pontuacao[x];
			}
		}
		System.out.printf("A maior pontuação foi "+ mP);

	}

}
