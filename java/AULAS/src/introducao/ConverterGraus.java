package introducao;

public class ConverterGraus {
	public static void main(String[] args) {
		
		double far= 75;
		double cel ;
		double kel ;
		cel = (far - 32) * 5/9;
		kel= cel +273.15;
		
		System.out.println("a temperatura de celsius para fahrenheit é "+ cel);
		System.out.println(" para kelvin é "+kel);
		
		
	}

}
