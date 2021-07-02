package EXERCIOCIOS1JAVA;
   import java.util.Scanner;
public class lista1exe7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		int a, b , c , d , e , f , x , y;
		
		System.out.println("Digite o valor de a");
		a = ler.nextInt();
		System.out.println("Digite o valor de b");
		b = ler.nextInt();
		System.out.println("Digite o valor de c");
		c = ler.nextInt();
		System.out.println("Digite o valor de d");
		d = ler.nextInt();
		System.out.println("Digite o valor de e");
		e = ler.nextInt();
		System.out.println("Digite o valor de f");
		f = ler.nextInt();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("O valor de X e Y é: "+x +" e " + y);
		
	}

}
