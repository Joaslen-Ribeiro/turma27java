package introducao;
import java.util.Scanner;
public class exemploMatriz {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		String agenda [][]= new String [24][31]; 
		int horaaux=0, diaaux=0;
		
		
		agenda[11][6]="fazer programa java ";
		agenda [17][7]="barometro ";
		agenda[horaaux][diaaux]= ler.next().toUpperCase();
		System.out.println("digite o dia do evento");
		diaaux=ler.nextInt();
		System.out.println("digite a hora: ");
		horaaux= ler.nextInt();
		System.out.println("digite o evento: ");
		
		for (int hora=0; hora<24;hora++ ) {
			for(int dia=0;dia<31;dia++) {
				if(agenda[hora][dia]!=null)
				System.out.println(dia+hora+agenda[hora][dia]);
				
			}
		}
		
		
	}

}
