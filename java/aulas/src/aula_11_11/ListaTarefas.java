package aula_11_11;

import java.util.Scanner;

public class ListaTarefas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String agenda[][] = new String[5][31];
		int diaMes = 0;
		char continua = 'S';
		
		do
		{
		System.out.printf("Escolha o dia do mês: ");
		diaMes = leia.nextInt();
			for (int x = 0; x < 5; x++) 
			{
				System.out.println("TAREFA = "+(x+1));
				leia.nextLine();
				agenda[x][diaMes-1] = leia.nextLine();
			}
		System.out.printf("Deseja escolher outro dia? ");
		continua = leia.next().toUpperCase().charAt(0);
		}while (continua =='S');
		
		
	}

}
