package EXERCIOCIOS1JAVA;
    import java.util.Scanner;
public class exercicio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int ano, mes , dias=0;
		
		System.out.println("Digite sua idade em anos: ");
		ano = ler.nextInt();
		System.out.println("Digite sua idade em meses: ");
		mes = ler.nextInt();
		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		dias =(dias+(ano*365)+(mes*30) );
		
		System.out.println("seu tempo de vida expresso em dias é: "+ dias );
	}

}
