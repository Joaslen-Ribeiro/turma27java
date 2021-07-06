/*Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a 
 * média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
package lista1java;
   import java.util.Scanner;
public class lista2exe6 {

	public static void main(String[] args) {
	  Scanner ler= new Scanner (System.in);
	        int numero=0, cont=0, media=0,soma=0;
	     
    	     do {      
    	     System.out.println("Digite um numero: ");
    	     numero  = ler.nextInt(); 
    	      	      
    	     if(numero%3==0 && numero!=0 )
    	  {  soma+=numero;
    		  cont++;
    		 
    		  
    	    }
    	  
            } while( numero!=0 );
	           media=soma/cont;
      
	System.out.println("a media dos numeros digitados multiplos por 3: "+media);
	
	
	
	}

}
