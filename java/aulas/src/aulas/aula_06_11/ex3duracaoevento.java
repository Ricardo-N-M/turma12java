package aulas.aula_06;

import java.util.Scanner;

public class ex3duracaoevento {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		int temposeg, horas;
		int minutos, segundos;
		
		System.out.println("Quanto tempo o evento durou em segundos? ");
		temposeg = read.nextInt();
		
		horas=temposeg/3600;
		minutos=(temposeg%3600)/60;
		segundos=((temposeg%3600)%60);
		System.out.println("O evento durou "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos.");

	}

}
