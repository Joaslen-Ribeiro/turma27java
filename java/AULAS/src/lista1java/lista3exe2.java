package lista1java;
  import java.util.Scanner;
public class lista3exe2 {

	public static void main(String[] args) {
Scanner ler= new Scanner(System.in);
        
        int [] lancamentos= new int[10];
        int  maiores=0, media=0;
        int contador=0;
        int somaL=0;
        
        
      for(int x=0; x<10;x++) {
    	  System.out.println(" Qual numero que caiu: ");
    	   lancamentos[x]  =ler.nextInt();
    	   somaL+=lancamentos[x];
    	   media= somaL/10;
    	   if(lancamentos[x]>maiores  ) {
    		   maiores=lancamentos[x];
    	   }
    	   
    }for(int x=0;x<10;x++ ) {
    	if(lancamentos[x]==maiores) {
    		contador++;
    		
    	}
    	
    	
    }
      
    System.out.println(media );
    System.out.println(somaL );
      System.out.println(  maiores);
      }

}
