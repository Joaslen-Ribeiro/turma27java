package introducao;

public class Fone {
	int volume=1;
	String cor;
	String marca;
	double preco;
	boolean ligado;
	
	
	void  ligar (){
		this.ligado=true;
		System.out.println("Ligando... ");
	}
	 void desligar () {
    	this.ligado=false;
    	System.out.println("Desligando...");
    }
	void aumentarVolume() {
		this.ligado=true;
		System.out.println("aumentando volume... ");
	}
    
		
	}
	
	
	


