package EXERCIOCIOS1JAVA;
  import java.util.Scanner;
public class converterNumeroImpar {
      
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		int numero;
          System.out.println("digite um valor inteiro: " );
          numero = ler.nextInt();
          
            
            	
            if (numero==0)  {System.out.println(" � neutro ");
        		
            	}
                  
            if(numero<0     ) {
            	
            	System.out.println("o numero: "+ numero+ " � invalido " );
            }
        
                else if  (numero%2==0)   {    
             
	             System.out.println("o numero: "+ numero+ " � par ");
      }
	
		       else if  ( numero%2==1 )
            System.out.println("o numero: "+ numero+ " � impar ");
            
	  
	}       
	}
