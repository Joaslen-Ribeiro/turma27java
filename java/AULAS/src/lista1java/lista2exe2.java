//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
package lista1java;
         import java.util.Scanner;
public class lista2exe2 {
  
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		  
		int n1=0,x, limite=10, contpar=0,contimpar=0;
		 
		for (x=1; x<=limite;x++ ) {
		System.out.println("Digite o numero: ");
		n1 = ler.nextInt();
		 
		  if(n1%2==0 )  {
			  contpar++;
		  }
          if(n1%2==1 ) {
        	  contimpar++;
          }  				
		
		}
		    System.out.println("A quantidade de numeros pares � "+ contpar );
		    System.out.println("A quantida de numeros impares � "+ contimpar);
	}
			
		
		
		 
		
		}	
	
		
	


