package entities;

public class BancaEd {
    public static void main(String [] args) {
    	
    	Revista  prod1 = new Revista(01,10.00,5,"Abril");
    	Salgadinho prod2 = new Salgadinho("Fofura",5.00,5,"luck"); 
		
    	
    	prod1.setNome("craudia");
    	prod1.colocarEstoque(10);
    	
    	System.out.println(prod1.getEstoque());
    
    	prod1.tirarEsqtoque(5);
    
    	System.out.println(prod1.getNome());
    	System.out.println(prod1.getEstoque());
    	
    
    
    
    }
    
}
