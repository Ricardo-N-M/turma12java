package aulas.aula_09_11;

import java.util.Scanner;

public class ex_7 {

	public static void main(String[] args) {
		// Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos 
		//(positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.
		Scanner leia = new Scanner(System.in);
		
		double base, altura;
		
		System.out.print("Digite o valor da base em metros por obs�quio: ");
		base = leia.nextDouble();
		System.out.print("\nDigite o valor da altura em metros por obs�quio: ");
		altura = leia.nextDouble();
		
		if(base > 0 && altura > 0)
		{
			System.out.printf("\nA �rea deste tri�ngulo � igual � %.2f ", ((base*altura)/2),"m�");
		}
		else
		{
			System.out.println("\nDOES NOT COMPUTE!!! ERROR!!!");
		}

}
}
