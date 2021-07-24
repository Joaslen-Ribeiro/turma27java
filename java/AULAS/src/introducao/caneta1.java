package introducao;

public class caneta1 {
public	String modelo;
private	double ponta;
private boolean tampada;
private String cor;

	
public  caneta1(String m,double p,boolean p1,String c) {
	super();
	this.modelo = "Preta";
	this.ponta = 0.7;
	//this.tampada = tampada;
	this.cor = "Preta";
}
public String getmodelo() {
	return this.modelo;
}
public void setModelo(String m) {
	this.modelo= m;
}
public double getponta() {
	return this.ponta; 
}
public void setponta(double p) {
	 this.ponta=p;
}
public void tampar() {
	this.tampada=true;
}
public void destampar() {
	this.tampada=false;
}
public void status() {
	
/*	System.out.println("Sobre a Caneta: ");
	System.out.println("Modelo: "+this.modelo);
	System.out.println("Tipo de ponta: "+this.ponta);
	System.out.println("Modelo: "+this.getmodelo());
	System.out.println("Tipo de ponta: "+this.getponta());*/
	
	
	
}
}
