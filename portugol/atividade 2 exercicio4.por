programa
{
	
	funcao inicio()

	{inteiro num
	
	
      	
	
		escreva("digite um numero")
		leia(num)
		
		 se(num<0 e num%2==-1   ) {
		  	 
		escreva("negativo e impar ")
		}
	     senao se(num>0 e num%2==1 ){escreva("positivo e impar ")
			 
		}senao se (num>0 e num%2==0  ){
			escreva("positivo e par")}
		senao se(num<0 e num%-2==0 ){
					escreva("negativo e par")} senao se (num==0)  
					escreva ("seu digito é zero") 
		}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */