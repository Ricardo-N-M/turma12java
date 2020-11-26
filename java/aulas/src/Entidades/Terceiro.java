package Entidades;

public class Terceiro extends Funcionario1{
	private double adicional;

	public Terceiro(String codigo, double horas, double valorHora, double adicional) {
		super(codigo, horas, valorHora);
		this.adicional = adicional;
	}

	public Terceiro() {
		super();
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double pagamentoSalario ()
	{
		return this.valorHora * this.horas+this.adicional;
	}

}
