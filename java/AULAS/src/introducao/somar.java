/*// 2- Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os 
 * n�meros  de 1 at� ele.
Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.*/
package introducao;

public class somar {
	import java.util.Scanner;   
	public static void main(String[] args) {
		
		
		Scanner ler= new Scanner(System.in);

		
		
      int numero;
      int x=1;
      int aux=1;
      System.out.println("digite um numero positivo inteiro");
		numero = ler.nextInt();
		if(numero<=0){
			System.out.println("digite um numero positivo");
		}
		else { 
		do{
//1 1+2+3+4+5+6+7      aux+=(aux+2) 
               System.out.println("%d + ",x);
               x++;
               aux=aux+x;
		}while (x<numero);
	}System.out.println(" = "+aux);

}
