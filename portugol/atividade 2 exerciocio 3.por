programa 
 { 
	
	funcao inicio()
	{   inteiro N1, N2, N3, N4 , NQ1, NQ2,NQ3,NQ4
		escreva("digite um numero: ")
		leia(N1)
		escreva("digite um numero: ")
		leia(N2)
		escreva("digite um numero: ")
		leia(N3)
		escreva("escreva um numero: ")
		leia(N4)
		limpa()
		NQ1=N1*N1
		NQ2=N2*N2
		NQ3=N3*N3
		NQ4=N4*N4
		
		se (NQ3 >= 1000){
		escreva(N3,"*",N3,"=",NQ3)	
		
		}senao{ 
			escreva(N1," * ",N1," = ",NQ1,"\n")
			escreva(N2," * ",N2," = ",NQ2,"\n")
			escreva(N3," * ",N3," = ",NQ3,"\n")
			escreva(N4," * ",N4," = ",NQ4,"\n")			
		}
	}
}


/*Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */