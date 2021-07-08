package OBJETOS;

public class objetoVeiculo {
	public int passageiros;
    public int   rodas;
    public String locomocao;
    public String conducao;
    public boolean ligado;
    public int velocidade;
    
    public void ligarCarro() {
    	ligado=true;
    	System.out.println("Carro ligando...");
   }public void desligarCarro() {
	   if (velocidade==0) {
	   ligado=false;
	   System.out.println(" Carro desligando...");
   }  else { System.out.println("Desacelere o carro... "); }
	   }
    public void acelerar()
    {velocidade++;
    System.out.println();	
    }
    

}
