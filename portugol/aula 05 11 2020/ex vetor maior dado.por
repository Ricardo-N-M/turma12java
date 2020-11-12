programa
{
	//  Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos,
	//escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos,
	//contabilize e apresente também quantas foram as ocorrências da maior pontuação.
	funcao inicio()
	{
		real valorDado[10], maiorValor = 0.0,  total = 0.0, c = 0.0
		real media =1.0
		inteiro nMaiorValor = 0, x
		
		para ( x=0; x <10; x++)
		{
			c++
			escreva ("Digite o valor do dado: ")
			leia(valorDado[x])
			total = total+ valorDado[x]		
			se(valorDado[x] >= maiorValor )
			{
				se (valorDado[x] != maiorValor)
				{
					nMaiorValor = 0
				}
				maiorValor = valorDado[x] //maior valor já resolvido
				nMaiorValor ++
			}
			
		}
		media=total/10 //média resolvida
		limpa()
		escreva("\nA média dos valores foi de ",media)
		escreva("\nO maior valor foi ",maiorValor," e ele apareceu ",nMaiorValor," vezes" )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 671; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */