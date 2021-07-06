/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
 *  atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */
package lista1java;
import java.util.Scanner;
public class lista3exe1 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		 int maiorN=0;
		 int num=0;
		 int x=0;
		int notas[]= new int [5];
		for ( x=0;x<5;x++ ) {
			
			System.out.println("Digite um numero: ");
			notas[x]= ler.nextInt();
		if (notas[x]>maiorN)   
			maiorN=notas[x];
		
		}
		
		     System.out.println("maior numero digitado é: "+maiorN);
		} 
	
		
		

}

