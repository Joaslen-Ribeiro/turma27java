package OBJETOS;

public class TesteLamapda {

	public static void main(String[] args) {
		   
		Lampada lampada = new Lampada("LED ", 15.00, "economica "," Branco ", 100);
		
		
		System.out.println("tipo: "+lampada.getTipo());
		System.out.println("preço "+lampada.getPreco() );
		System.out.println("Qualidade "+lampada.getQualidade() );
		System.out.println("cor: "+lampada.getCor());
		System.out.println("Consumo: "+lampada.getConsumo());
		

	}

}
