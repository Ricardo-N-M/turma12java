package Entidades;

public class ContaEspecial extends ContaCorrente {

	private double limite;
	
	//CONSTRUTOR
	public ContaEspecial(int numero, double limite) {
		super(numero);
		this.limite = limite;
		// TODO Auto-generated constructor stub
	}
	//ENCAPSULAMENTO
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//MÉTODO
	public void usarLimite(double valor) 
	{
		if(super.getSaldo()<=0 && this.limite <=valor);
		super.creditar(valor);
		this.limite -= valor; // operadores
		// o de cima é a mesma coisa que isso aqui : this.limite = this.limite - valor;
	}
}
