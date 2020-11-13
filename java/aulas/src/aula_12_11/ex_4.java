package aula_12_11;

public class ex_4 {
	public static void main (String args[])
	{

		int numerador = 1;
		double soma = 0.0, denominador = 1;
		
		for (denominador =1; denominador <= 50; denominador++)
		{
			System.out.print(numerador + "/"+ denominador+"\n");
			
			soma = soma + (numerador/denominador);
			
			numerador = numerador + 2;
		}
		System.out.printf("soma = %.2f",soma);
	}

}
