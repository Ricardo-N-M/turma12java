programa
{
	//Faça um programa que leia um vetor de 5 posições para números inteiros e, depois, um código inteiro.
	//Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o
	//vetor na ordem inversa. Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.

	funcao inicio()
	{
		inteiro vetor[5], codigo, vetorAuxiliar=0
		
		para(vetorAuxiliar = 0; vetorAuxiliar <=4; vetorAuxiliar++)
		{
			escreva("Digite um número: ")
			leia(vetor[vetorAuxiliar])
			escreva("\n")
		}
		limpa()
		escreva("Digite o código 1 para exibição na ordem direta ou 2 na ordem inversa: ")
		leia(codigo)
		se (codigo ==1)
		{
			para(vetorAuxiliar = 0; vetorAuxiliar <=4; vetorAuxiliar++)
		{
			escreva(vetor[vetorAuxiliar])
			escreva("\n")
		}
		}
		senao se (codigo ==2)
		{
			para(vetorAuxiliar = 4 ; vetorAuxiliar >=0; vetorAuxiliar--)
		{
			escreva(vetor[vetorAuxiliar])
			escreva("\n")
		}
		}
		senao
		{
			escreva ("ERRO 498 CÓDIGO INVÁLIDO")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 908; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 9, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */