package introducao;

import java.util.Scanner;

public class Estande {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Revolver38 rev38 =new Revolver38(null, null, 0, 0, false, false, 0, 0, null);
		System.out.println(" BEM VINDO AO ESTANDE SOBREVIVENCIA EM SP ");
	System.out.println("Qual seu nome :");
	rev38.setUsuario(leia.next());
	System.out.println("Disponibilizamos para o senhor o revolver 38");
	System.out.println("Quantas muniçao o senhor quer de 1 a 6? ");
	rev38.recarregando(leia.nextInt());
	System.out.println("o senhor precisar puxar o cao do gatilho ");
	rev38.puxarCao();
	System.out.println("o senhor quer ir pra posiçao de atirar? S/N");
	rev38.respostaAtirar(leia.next());
	
	
	
	
	}

}
