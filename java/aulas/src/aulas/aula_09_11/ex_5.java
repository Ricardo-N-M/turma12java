package aulas.aula_09_11;

import java.util.Scanner;

public class ex_5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double indice;
		System.out.print("Digite o índice de poluiçao registrado: ");
		indice = leia.nextDouble();
		if ((indice>=0.3) && (indice<0.4))
		{
			System.out.print("O primeiro grupo de empresas deve paralisar as suas atividades imediatamente");
		}
		else if ((indice>=0.4) && (indice<0.5))
		{
			System.out.print("O primeiro e o segundo grupo de empresas devem paralisar as suas atividades imediatamente");
		}
		else if (indice>=0.5)
		{
			System.out.print("Todas am empresas devem paralisar as suas atividades permanentemente");
		}
		else
		{
			System.out.print("Índices dentro do aceitável");
		}
	}

}
