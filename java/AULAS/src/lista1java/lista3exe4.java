/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
 * ou seja, diagonal principal.*/
package lista1java;
  import java.util.Scanner;
public class lista3exe4 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		int valores [][]= new int [3][3]; 
		int linha=0;
		int coluna=0;
		int somaV=0;
		int somaVD=0;
			for(linha=0; linha<valores.length;linha++ ) {
				for(coluna=0; coluna<valores.length;coluna++  ) {
				System.out.println("digite um numero: ");
				 valores[linha][coluna] =ler.nextInt();
			 somaV+=valores[linha][coluna];
			    somaVD+=valores[linha][linha];
				}}
			  System.out.println(somaV);
			  System.out.println(somaVD);
	}

}
