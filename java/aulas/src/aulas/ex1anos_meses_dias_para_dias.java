package aulas;

import java.util.Scanner;

//1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e 
//dias e mostre-a expressa apenas em dias. 
public class ex1anos_meses_dias_para_dias {
	public static void main(String args[]) {
			
	Scanner leia = new Scanner (System.in);
	
	int anos,meses,dias,diasResposta;
	
	System.out.println("Quantos anos voc� tem? ");
	anos = leia.nextInt();
	System.out.println("Quantos meses voc� tem? ");
	meses = leia.nextInt();
	System.out.println("Quantos dias voc� tem? ");
	dias = leia.nextInt();
		
	diasResposta = (anos*365) + (meses*30) + dias;
			
	System.out.println("Voc� tem " + diasResposta + " dias de vida. Pode contar pros seus amigos");
	
	
	}
}
