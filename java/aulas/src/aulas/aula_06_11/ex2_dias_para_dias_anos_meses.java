package aulas.aula_06;

import java.util.Scanner;

//2. Faça um sistema que leia a idade de uma pessoa expressa em 
//dias e mostre-a expressa em anos, meses e dias.

public class ex2_dias_para_dias_anos_meses {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int anos,meses,diasPergunta;
		
		System.out.println("Quantos dias de vida você tem?");
		diasPergunta = leia.nextInt();
		
		
		anos= diasPergunta/365;
		meses =(diasPergunta%365)/30;
		
		System.out.println("Você tem " + anos + " anos e " + meses + "meses de vida");
		

	}

}
