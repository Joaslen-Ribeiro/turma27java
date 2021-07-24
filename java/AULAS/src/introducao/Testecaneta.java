package introducao;

public class Testecaneta {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		/*c1.cor= "Azul";
		c1.ponta=0.5f;
		c1.destampar();
		c1.rabiscar();
		c1.status();
		System.out.println("");
		
		Caneta c2 =new Caneta();
		c2.modelo="Faber-Castel ";
		c2.carga=10;
		c2.cor="Preta ";
		c2.ponta=0.7f;
		c2.destampar();
		c2.rabiscar();
		c2.status();*/
		
		c1.modelo="bic crystal";
		c1.cor="Azul";
		//c1.ponta=0.5f;
		c1.carga=10;
		c1.tampada=true;
		
		
		c1.status();
	}

}
