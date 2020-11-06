package aulas;

import java.util.Scanner;

public class conversortemperatura {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double F, C;
		
		System.out.print("Digite a temperatura em celsius: ");
		C = leia.nextDouble();
		
		F=((C*1.8)+32);
				
		System.out.printf("A temperatura em fahrenheit é %.1f",F);
		
		
		
	}

}
