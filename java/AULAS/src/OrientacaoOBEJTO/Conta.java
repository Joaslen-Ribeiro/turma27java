package OrientacaoOBEJTO;

public class Conta {
	
	private int numero;
	private double saldo;
	private double limite;
	
	//construtor
	public Conta(int numero) {
		this.numero =  numero;
	}
	public Conta(int numero, double saldo) {
		this.numero =  numero;
		this.saldo = saldo;
	}
	public Conta(int numero, double saldo, double limite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	//encapsulamentos
	public int getNumero() {
		return numero;
	}/*
	public void setNumero(int numero) {
		this.numero = numero;
	}*/
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}	
	
	// metodos proprios
	
	public void  imprimeExtrato() {
		System.out.println("conta: "+ numero+" saldo Atual R$: "+saldo);
	
	}
	public void saca(double valorSaque ) {
		   saldo=saldo-valorSaque; 
	}
	public void depositar(double valorDeposito) {
		   saldo=saldo+valorDeposito;
	}
	
	

}
