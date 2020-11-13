package aula_12_11;

import java.util.Scanner;

/* 
1-  	Elabore um programa que calcule o que deve ser pago por um produto, considerando o pre�o normal de etiqueta e 
		a escolha da condi��o de pagamento. Utilize os c�digos da tabela a 
		seguir para ler qual a condi��o de pagamento escolhida e efetuar o c�lculo adequado.C�digo Condi��o de pagamento
		1 � vista em dinheiro ou cheque, recebe 20% de desconto
		2 � vista no cart�o de cr�dito, recebe 15% de desconto
		3 Em duas vezes, pre�o normal de etiqueta sem juros
		4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%
 
 */
public class Ex_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double preco = 0.0, total = 0.0;
		char opcao;
		
		System.out.print("Digite o pre�o total: ");
		preco = leia.nextDouble();
		System.out.print("Voc� gostaria de pagar [1] � vista no dinheiro/cheque;[2] � vista no cart�o; [3] 2 parcelas no cart�o ou [4] 3 parcelas no cart�o?");
		opcao = leia.next().charAt(0);
		if (opcao =='1')
		{
			total = ((preco/100)*80);
			System.out.printf("Com o desconto de 20% voc� vai pagar R$ %.2f",total);
		}
		else if (opcao =='2')
		{
			total = ((preco/100)*85);
			System.out.printf("Com o desconto de 15% voc� vai pagar R$%.2f",total);
		}
		else if (opcao =='3')
		{
			System.out.printf("Como n�o houve mudan�a de pre�o voc� vai pagar R$%.2f",preco);
		}
		else if (opcao =='4')
		{
			total = ((preco/100)*110);
			System.out.printf("Com o acr�scimo de 10% voc� vai pagar R$%.2f",total);
		}
		else
		{
			System.out.print("OP��O INV�LIDA, ERRO.");
		}
	}

}
