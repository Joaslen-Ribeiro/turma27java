package introducao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadChurras {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		List <String> listaChurras = new ArrayList<>();
		listaChurras.add(" Refrigerante ");
		listaChurras.add(" Pao de alho ");
		listaChurras.add(" Queijinho ");
		listaChurras.add(" Carne de Jaca");
		listaChurras.add(" Abacaxi ");
		listaChurras.add(" Farofa ");
		listaChurras.add(" Picanha ");
		listaChurras.add("Asas de Frango ");
		listaChurras.add(" Linguiça Apimentadinha ");
		
		for(String item : listaChurras  ) {
			System.out.println("Item : "+item);
		}
		listaChurras.add(1,"Tang ");
		
		System.out.println();
		
		
		
		
	}
}