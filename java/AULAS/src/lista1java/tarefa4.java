/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � 
par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o
 n�mero elevado ao quadrado.
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
			 System.out.println("O numero � par e a raiz quadrada dele �: "+d );
		 }if(a%2==1  ) {
			 d= Math.pow(a,2);
			 System.out.println("O numero � impar e a potencia dele �: "+d);
		 }

	}

}
