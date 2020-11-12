package aula_11_11;

import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		double valorDado[]= new double[10];
		double maiorValor = 0.0,  total = 0.0, c = 0.0;
		double media = 1.0;
		int nMaiorValor = 0, x;
				
		for ( x=0; x <10; x++)
		{
			c++;
			System.out.println("Digite o valor do dado: ");
			valorDado[x] = leia.nextInt();
			total = total+ valorDado[x];		
			if(valorDado[x] >= maiorValor )
			{
				if (valorDado[x] != maiorValor)
				{
					nMaiorValor = 0;
				}
				maiorValor = valorDado[x]; //maior valor já resolvido
				nMaiorValor ++;
			}
		}
		media=total/10; //média resolvida
		System.out.printf("\nA média dos valores foi de "+media);
		System.out.printf("\nO maior valor foi "+maiorValor+" e ele apareceu "+nMaiorValor+" vezes");
	}

}
