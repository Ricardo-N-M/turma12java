package aula_12_11;

import java.util.Scanner;

/* 
1-  	Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e 
		a escolha da condição de pagamento. Utilize os códigos da tabela a 
		seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.Código Condição de pagamento
		1 À vista em dinheiro ou cheque, recebe 20% de desconto
		2 À vista no cartão de crédito, recebe 15% de desconto
		3 Em duas vezes, preço normal de etiqueta sem juros
		4 Em três vezes, preço normal de etiqueta mais juros de 10%
 
 */
public class Ex_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double preco = 0.0, total = 0.0;
		char opcao;
		
		System.out.print("Digite o preço total: ");
		preco = leia.nextDouble();
		System.out.print("Você gostaria de pagar [1] á vista no dinheiro/cheque;[2] á vista no cartão; [3] 2 parcelas no cartão ou [4] 3 parcelas no cartão?");
		opcao = leia.next().charAt(0);
		if (opcao =='1')
		{
			total = ((preco/100)*80);
			System.out.printf("Com o desconto de 20% você vai pagar R$ %.2f",total);
		}
		else if (opcao =='2')
		{
			total = ((preco/100)*85);
			System.out.printf("Com o desconto de 15% você vai pagar R$%.2f",total);
		}
		else if (opcao =='3')
		{
			System.out.printf("Como não houve mudança de preço você vai pagar R$%.2f",preco);
		}
		else if (opcao =='4')
		{
			total = ((preco/100)*110);
			System.out.printf("Com o acréscimo de 10% você vai pagar R$%.2f",total);
		}
		else
		{
			System.out.print("OPÇÃO INVÁLIDA, ERRO.");
		}
	}

}
