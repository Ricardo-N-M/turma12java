programa
{
	
	funcao inicio()
	{
		real I
		escreva("Digite o índice de poluiçao registrado")
		leia(I)
		se ((I>=0.3) e (I<0.4))
		{
			escreva("O primeiro grupo de empresas deve paralisar as suas atividades imediatamente")
		}
		senao se ((I>=0.4) e (I<0.5))
		{
			escreva("O primeiro e o segundo grupo de empresas devem paralisar as suas atividades imediatamente")
		}
		senao se (I>=0.5)
		{
			escreva("Todas am empresas devem paralisar as suas atividades permanentemente")
		}
		senao
		{
			escreva("Índices dentro do aceitável")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 260; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */