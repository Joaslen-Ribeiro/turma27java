package introducao;
 import java.util.Scanner;
public class exemplogen2 {

	public static void main(String[] args) {
	   Scanner ler= new Scanner (System.in);
		
	   int[] arrayum= {12,3,5,68,9,6,73,44,456,65,321};
	   int[] arraydois= {43,42,4,8,55,21,2,45};
	   
	   float[] nota=new float[5];
	   //tamanho do array
	   if(arraydois.length>8){
	   System.out.println(" tamanho do arraydois - maior 8");
	   }else {
	   System.out.println("Tamanho do arraydois - menor que 8");
	   
	   }
	   System.out.println("tamanho do arrayum ="+arrayum.length);
	   
	   
	   //ultilizaçao do for-each
	   String[] cars= {" volvo "," Ford ", " Mazda "};
	   for (String i:cars) {
	      System.out.println(i);
	   	   }
	   //populando um array
	   for (int i=0;i<5;i++) {
		   
		   System.out.println("Entre com uma nota: ");
		   nota[i]= ler.nextFloat();
	   }
	  for(int i=0;i<5;i++) {
		  System.out.println("nota "+i+1+" = "+nota[i]);
		 
	 }
	
	
	
	}
	}
