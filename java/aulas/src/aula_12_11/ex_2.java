package aula_12_11;

import java.util.Scanner;

public class ex_2 {
	public static void main (String [] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int peso = 0;
		double imc = 0.0, altura = 0.0;
		
		System.out.print("Digite a sua altura: ");
		altura = leia.nextDouble();
		System.out.println();
		System.out.print("Digite o seu peso em quilos sem as gramas: ");
		peso = leia.nextInt();
		imc = peso/(altura*altura);
		System.out.println();
		imc(imc);
	}
	


public static void imc(double valor)
{
	if (valor <18.5)
	{
		System.out.println("Você está abaixo do peso.");
	}
	else if (valor >= 18.5 && valor<25)
	{
		System.out.println("Você está com o peso na faixa ideal.");
	}
	else if (valor >= 25 && valor<30)
	{
		System.out.println("Você está acima do peso recomendado.");
	}
	else if(valor>30)
	{
		System.out.println("Você está obeso");
	}
}
}

