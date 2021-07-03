/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é 
par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o
 número elevado ao quadrado.
 */
package lista1java;

import java.util.Scanner;

public class tarefa4 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		int a ;
		double d;
		System.out.println("Digite um numero: ");
		a =ler.nextInt();
		
		 if (a%2==0  ) {
			 
			d= Math.sqrt(a);
			 System.out.println("O numero é par e a raiz quadrada dele é: "+d );
		 }if(a%2==1  ) {
			 d= Math.pow(a,2);
			 System.out.println("O numero é impar e a potencia dele é: "+d);
		 }

	}

}
