programa
{
	
	funcao inicio()
	{
		inteiro peso
		real altura, IMC
		
		escreva("Digite o seu peso ")
		leia(peso)
		escreva("\n Digite a sua altura ")
		leia(altura)
		IMC = peso/altura*(peso/altura)
		se (IMC <18.5)
		{
			escreva("\n Você está abaixo do peso!!")
		}
		senao se (IMC => 18.5 e IMC < 25 )
		{
			escreva("\n Você está no peso normal.")
		}
		senao se (IMC => 25 e IMC < 30)
		{
			escreva("\n Você está acima do peso .")
		}
		senao se (IMC => 30)
		{
			escreva("\n Você está obeso.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 279; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */