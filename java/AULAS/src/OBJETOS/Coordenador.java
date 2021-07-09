package OBJETOS;

public class Coordenador extends Pessoa1 {
	private String cursoCoordenador;
	public Coordenador (String nome, int matricula, String cursocoordenador) {
		super(nome,matricula);
		this.cursoCoordenador=cursoCoordenador;
		
		}
	public String getCursoCoordenador() {
		return cursoCoordenador;
	}
	public void setCursoCoordenador(String cursoCoordenador) {
		this.cursoCoordenador = cursoCoordenador;
	}
	
		
}
