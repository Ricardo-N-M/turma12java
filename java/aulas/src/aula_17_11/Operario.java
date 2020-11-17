package aula_17_11;

public class Operario extends Pessoa_lista {
	private double valorProducao;
	private double vencimento;
	private double comissao;
	public Operario(String nome, String telefone, double valorProducao) {
		super(nome, telefone);
		this.valorProducao = valorProducao;
	}
	public Operario(String nome, String telefone, double vencimento, double comissao) {
		super(nome, telefone);
		this.vencimento = vencimento;
		this.comissao = comissao;
	}
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
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
	

}
