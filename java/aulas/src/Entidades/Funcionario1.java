package Entidades;

public class Funcionario1 {
	private String codigo;
	protected double horas;
	protected double valorHora;
	public Funcionario1(String codigo, double horas, double valorHora) {
		this.codigo = codigo;
		this.horas = horas;
		this.valorHora = valorHora;
	}
	public double pagamentoSalario ()
	{
		return this.valorHora * this.horas;
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public Funcionario1() {
		super();
	}
	
	

}
