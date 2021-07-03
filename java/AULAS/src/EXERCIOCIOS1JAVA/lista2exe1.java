/*João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
 *  Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do 
 *  estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
 *  João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há 
 *  excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João 
 *  deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/
package EXERCIOCIOS1JAVA;
    import java.util.Scanner;
public class lista2exe1 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int peso, excesso, multa;
		System.out.println("quantos quilos tem seu pacote de tomate");
		peso =ler.nextInt();

		  if (peso<=50   ) {
			  System.out.println("o seu pacote de " +peso+  " quilos ta dentro do permitido ");
			  
					}
		    else  { excesso=peso-50 ;
		    		multa=excesso*4;
		    	   System.out.println("o saco ultrapassou "+excesso+"quilos a multa a pagar é "+multa);	
		    		
		    }
		
	}

}
