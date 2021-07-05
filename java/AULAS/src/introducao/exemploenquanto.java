package introducao;
        
          import java.util.Scanner;
public class exemploenquanto {

	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		
		int idade;
	 
	System.out.printf("\nentre com a sua idade: ");
	idade= leia.nextInt();

	while (idade>=1) {
		
		System.out.printf("\nsua idade: %d", idade);
	
	    if(idade>=18) {
	    	System.out.printf("\nvoce é maior de idade: ");
	    }
	    else {
	    	System.out.println("\nvoce é de menor ");
	    
	    }System.out.printf("\nentre com a sua idade: ");
		idade= leia.nextInt();
	} 
	
	
	
	}

}
