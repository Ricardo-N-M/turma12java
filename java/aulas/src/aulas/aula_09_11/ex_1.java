package aulas.aula_09_11;

import java.util.Scanner;

public class ex_1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int peso , excesso, multa;
		
		System.out.println("Digite o peso dos tomates: ");
		peso = leia.nextInt();
		
		
		if (peso >= 50)
		{
			excesso=peso-50;
			multa = excesso*4;
			System.out.printf("\"O peso excedente foi de %d quilos e a multa foi de R$ %d.00 reais", excesso, multa);
		}
		else
		{
			System.out.printf("EXCEDENTE ZERO, MULTA R$0,00");
		}

	}
}
