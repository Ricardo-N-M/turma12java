package aulas.aula_09_11;

import java.util.Scanner;

public class ex_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		System.out.print("Diga um número: ");
		numero = leia.nextInt();
		if (numero<0)
		{
			System.out.print("\nO número requisitado é negativo");
		}
		else if (numero>0) 
		{
			System.out.print(((numero%2)==0)?"\nO número digitado é positivo e par":"\nO número digitado é positivo e ímpar");
			//se ((n%2)==0)
			//{
				//escreva("O número digitado é positivo e par")
			//}
			//senao
			//{
				//escreva("O número digitado é positivo e ímpar")
			//}
		}
		
	}

}
