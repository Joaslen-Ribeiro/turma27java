package introducao;

public class Aula04 {

	public static void main(String[] args) {
	caneta1 c1=new caneta1("bic",0.8,true,"Preta");
	c1.status();
	caneta1 c2=new caneta1("HB",0.9,false,"amrelo");
	c2.status();
//	c1.setModelo("Faber-Castel");
	//c1.modelo="Faber-Catesl";   	// modeo é public, ja a ponta é privada precisa dos get e set
	//c1.setponta(0.7d);
	//c1.status();
	
	}

}
