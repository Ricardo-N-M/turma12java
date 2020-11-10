package aulas;

import java.util.Scanner;

//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e 
//dias e mostre-a expressa apenas em dias. 
public class ex1anos_meses_dias_para_dias {
	public static void main(String args[]) {
			
	Scanner leia = new Scanner (System.in);
	
	int anos,meses,dias,diasResposta;
	
	System.out.println("Quantos anos você tem? ");
	anos = leia.nextInt();
	System.out.println("Quantos meses você tem? ");
	meses = leia.nextInt();
	System.out.println("Quantos dias você tem? ");
	dias = leia.nextInt();
		
	diasResposta = (anos*365) + (meses*30) + dias;
			
	System.out.println("Você tem " + diasResposta + " dias de vida. Pode contar pros seus amigos");
	
	
	}
}
