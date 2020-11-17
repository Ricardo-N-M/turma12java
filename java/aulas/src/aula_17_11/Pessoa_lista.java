package aula_17_11;

public class Pessoa_lista {
	private String nome;
	private String endereco;
	private String telefone;
	public Pessoa_lista() {
		
	}
	public Pessoa_lista(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	public Pessoa_lista(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
