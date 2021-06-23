programa
{
	
	funcao inicio()
	{
		cadeia nome
		real celsius
		real fahrenheit
		
		escreva("Digite o seu nome: ")
		leia(nome)
		escreva("Digite a temperatura em Fahrenheit: ")
		leia(fahrenheit)
		celsius = (fahrenheit - 32) * 1/8
		
		escreva(nome+"A temperatura em Celsius é : " + celsius + "ºC")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 252; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */