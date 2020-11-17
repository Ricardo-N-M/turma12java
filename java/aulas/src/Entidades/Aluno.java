package Entidades;



public class Aluno {
	private int matricula;
	private String nome;
	private int anoNascimento;
	private char genero;
	private boolean ativo;
	
	
	
	
	// construtores
	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	public Aluno() {
		
	}
	// método
	public String obterGenero()
	{
		String texto = "";
		if (this.genero == 'M') 
		{
			texto = "Aluno";
		}
		else if(this.genero == 'F')
		{
			texto = "Aluna";
		}
		else {
			texto = "Alune";
		}
		return texto;
	}
	public int idade()
	{
		return 2020-this.anoNascimento;
	}
	public int idade(int anoAtual)
	{
		return anoAtual-this.anoNascimento;
	}
	public void situacao(char status)
	{
		if (status == 'A')
		{
			this.ativo = true;
		}
		else 
		{
			this.ativo = false;
		}
	}
	public void situacao()
	{
		this.ativo = true;
	}
	// get/set
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String aluno) {
		this.nome = aluno;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	

}
