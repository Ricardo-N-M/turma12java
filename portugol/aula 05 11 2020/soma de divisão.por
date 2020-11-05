programa
{
	//Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50

	
	funcao inicio()
	{
		inteiro numerador = 1
		real soma = 0.0, denominador = 1.0
		
		para (denominador =1; denominador <= 50; denominador++)
		{
			escreva(numerador , "/", denominador,"\n")
			
			soma = soma + (numerador/denominador)
			
			numerador = numerador + 2
		}
		escreva("soma = ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 159; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */