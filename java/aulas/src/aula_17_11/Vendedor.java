package aula_17_11;

public class Vendedor extends Pessoa_lista{
	private double vencimento;
	private double comissao;
	private double valorVendas;
	public Vendedor(String nome, String telefone, double vencimento, double valorVendas) {
		super(nome, telefone);
		this.vencimento = vencimento;
		this.valorVendas = valorVendas;
	}
	public Vendedor(double vencimento, double comissao, double valorVendas) {
		super();
		this.vencimento = vencimento;
		this.comissao = comissao;
		this.valorVendas = valorVendas;
	}
	public double getVencimento() {
		return vencimento;
	}
	public void setVencimento(double vencimento) {
		this.vencimento = vencimento;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	

}
