package OBJETOS;

public class TesteCaroo {
	
	 public static void main (String args[])

	 {
		 Carro meucarro= new Carro();
		 meucarro.cor= "vermelha";
		 meucarro.modelo="passat";
		 meucarro.velocidadeAtual=0;
		 meucarro.velocidadeMaxima=80;
		 
		 
		 meucarro.liga();
		 meucarro.acelera(50);
		 System.out.println(meucarro.velocidadeAtual);
		 meucarro.pegaMarcha();
		 
	 }
	 
}
