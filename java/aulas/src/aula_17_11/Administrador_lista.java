package aula_17_11;

public class Administrador_lista extends Pessoa_lista{
	private double ajudaDeCusto;
	private String idCartaoCorporativo;
	private boolean secretaria;
	public Administrador_lista(String nome, String telefone, double ajudaDeCusto, boolean secretaria) {
		super(nome, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
		this.secretaria = secretaria;
	}
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	public String getIdCartaoCorporativo() {
		return idCartaoCorporativo;
	}
	public void setIdCartaoCorporativo(String idCartaoCorporativo) {
		this.idCartaoCorporativo = idCartaoCorporativo;
	}
	public boolean isSecretaria() {
		return secretaria;
	}
	public void setSecretaria(boolean secretaria) {
		this.secretaria = secretaria;
	}
	
	

}
