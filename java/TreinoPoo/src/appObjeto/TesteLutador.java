package appObjeto;

import classeObjeto.Lutador;

public class TesteLutador {

	public static void main(String[] args) {
		Lutador l[] =new Lutador[6]; 
				
			l[0] = new Lutador("Pretty Boy "," Fran�a ",31, 1.75f, 69.9, 11, 2, 1); 
			l[1] = new Lutador("Putscript "," Brasil ",29,1.68,57.8,14,2,3);
			l[2] = new Lutador("Snapshadow "," EUA ",35,1.65,80.9,12,2,1);
			l[1] = new Lutador("Dead Code "," Australia ",28,1.93,81.6,13,0,2);
			l[1] = new Lutador("UFOCobol "," Brasil ",37,1.70,119.3,5,4,3);
			l[1] = new Lutador("Nerdaart "," EUA ",30,1.81,105.7,12,2,4);
			
			
			l[0].apresentar();
		System.out.println(" ");
		l[0].status();
		System.out.println("     ");
		   
		l[1].apresentar();
		l[1].status();
	
	}

}
