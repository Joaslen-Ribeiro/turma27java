package introducao;

public class Caneta {
public	String modelo;
public	String cor;
private	float ponta;
protected	int carga;
protected 	boolean tampada;
public	void status() {
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Uma Caneta: "+this.cor);
		System.out.println("Esta Tampada? "+ this.tampada);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Carga: "+this.carga);
	}
	
protected void tampar() {
	this.tampada=true;
    
    }
    
public void rabiscar() {
if(this.tampada==true) {
    System.out.println("Erro! não pode rabiscar com a caneta tampada!");
}else {
	System.out.println("Estou rabiscando ");
	}}

protected void destampar() {
	this.tampada=false;
	
}
}
