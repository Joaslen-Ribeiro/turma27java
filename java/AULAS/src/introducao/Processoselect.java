package introducao;

public class Processoselect {

	public static void main(String[] args) {
		 int i=0;
		
	    
		
		 for(i=1 ; i<=200 ; i++){
				
	          if(i % 3 ==0 && i%5==0){
			System.out.println("M35");
				 }
	          else if(i % 3 ==0){
					System.out.println("M3");
					}
				
	          else if(i % 5 ==0){
					System.out.println("M5");
							}
	          else { 
	        	  System.out.println(i);
	          }
	
		        
          }
	}
}
