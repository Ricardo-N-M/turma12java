package aula_13_11;

import java.util.Scanner;

public class exemploProcedural {
	public static void main (String args[])
	{
		Scanner leia = new Scanner(System.in);
		
		int base1, altura1, area1, base2, altura2, area2;
		
		System.out.printf("Digite a altura do primeiro tri�ngulo: ");
		altura1 = leia.nextInt();		
		System.out.printf("Digite a base do primeiro tri�ngulo: ");
		base1 = leia.nextInt();
		System.out.printf("Digite a altura do segundo tri�ngulo: ");
		altura2 = leia.nextInt();
		System.out.printf("Digite a base do segundo tri�ngulo: ");
		base2 = leia.nextInt();
		
		
		
		if (altura1 <=0 || base1 <=0)
		{
			System.out.printf("Valor inv�lido, tente outra vez.");
			base1 = 0;
			altura1 = 0;
			System.out.printf("Digite a altura do primeiro tri�ngulo: ");
			altura1 = leia.nextInt();			
			System.out.printf("Digite a base do primeiro tri�ngulo: ");
			base1 = leia.nextInt();
		} while (altura1 <=0 || base1 <=0);
		
		
		if (altura2 <=0 || base2 <=0)
		{
			System.out.printf("Valor inv�lido, tente outra vez.");
			base2 = 0;
			altura2 = 0;
			System.out.printf("Digite a altura do segundo tri�ngulo: ");
			altura2 = leia.nextInt();			
			System.out.printf("Digite a base do segundo tri�ngulo: ");
			base2 = leia.nextInt();
		} while (altura2 <=0 || base2 <=0);
		
		
		area1 = ((base1*altura1)/2);
		area2 = ((base2*altura2)/2);
		System.out.print(area1);
		System.out.println();
		System.out.print(area2);
		System.out.println();
		
		if (area1>area2)
		{
			System.out.println("O primeiro tri�ngulo � maior");
		}
		else if (area1<area2)
		{
			System.out.println("O segundo tri�ngulo � maior");
		}
		else
		{
			System.out.println("Ambos os tri�ngulos tem �reas iguais.");
		}
	}

}
