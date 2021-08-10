package appObjeto;

import classeObjeto.Pessoa;

public class Testepessoa {
	public static void main(String[] args ) {
		
		Pessoa pessoa1 = new Pessoa("Joaslen batista"); //instanciando ou criar...
		
		pessoa1.darBomdia();
		pessoa1.genero= " Masculino";
		System.out.println(pessoa1.genero);
		
	}

}
