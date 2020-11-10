package aulas.aula_09_11;

import java.util.Scanner;

public class ex_7 {

	public static void main(String[] args) {
		// Receber valores de base e altura de um triângulo e verificar se são valores válidos 
		//(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
		Scanner leia = new Scanner(System.in);
		
		double base, altura;
		
		System.out.print("Digite o valor da base em metros por obséquio: ");
		base = leia.nextDouble();
		System.out.print("\nDigite o valor da altura em metros por obséquio: ");
		altura = leia.nextDouble();
		
		if(base > 0 && altura > 0)
		{
			System.out.printf("\nA área deste triângulo é igual á %.2f ", ((base*altura)/2),"m²");
		}
		else
		{
			System.out.println("\nDOES NOT COMPUTE!!! ERROR!!!");
		}

}
}
