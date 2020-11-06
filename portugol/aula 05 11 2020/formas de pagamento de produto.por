programa
{
	inclua biblioteca Matematica -->mat
	//Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	//de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
	//Código Condição de pagamento
	//1 À vista em dinheiro ou cheque, recebe 20% de desconto
	//2 À vista no cartão de crédito, recebe 15% de desconto
	//3 Em duas vezes, preço normal de etiqueta sem juros
	//4 Em três vezes, preço normal de etiqueta mais juros de 10%

	funcao inicio()
	{
		inteiro codigoDeProduto
		real valor = 0.0

		escreva("Obrigado pela sua compra. Informe o valor em reais: ")
		leia(valor)
		escreva(" Obrigado pela sua compra. Escolha a forma de pagamento. \n 1 para pagar á vista no dinheiro ou cheque. \n 2 para pagar á vista no cartão. \n 3 para parcelar em duas vezes. \n 4 para parcelar 3 vezes.\n")
		leia (codigoDeProduto)
		escolha (codigoDeProduto)
		{
			caso 1:
			valor=(valor/5)*4
			valor = mat.arredondar(valor, 2)
			escreva("\nCom os 20% de desconto você vai pagar um total de R$",valor,".")
			pare
			
			caso 2:
			valor=(valor/20)*17
			valor = mat.arredondar(valor, 2)
			escreva("\nCom os 15% de desconto você vai pagar um total de R$",valor,".")
			pare

			caso 3:
			escreva("Você vai pagar R$",valor".")
			pare

			caso 4:
			valor=(valor/10)*11
			valor = mat.arredondar(valor, 2)
			escreva("Com os 10% de juros você vai pagar R$",valor," no total")
			pare
			
		}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1780; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */