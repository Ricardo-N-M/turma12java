package aulas.aula_09_11;

import java.util.Scanner;

public class ex_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		System.out.print("Diga um n�mero: ");
		numero = leia.nextInt();
		if (numero<0)
		{
			System.out.print("\nO n�mero requisitado � negativo");
		}
		else if (numero>0) 
		{
			System.out.print(((numero%2)==0)?"\nO n�mero digitado � positivo e par":"\nO n�mero digitado � positivo e �mpar");
			//se ((n%2)==0)
			//{
				//escreva("O n�mero digitado � positivo e par")
			//}
			//senao
			//{
				//escreva("O n�mero digitado � positivo e �mpar")
			//}
		}
		
	}

}
