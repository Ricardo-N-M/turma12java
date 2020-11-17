package Entidades;

public class Aviao {
	public String modelo;
	public String fabricante;
	public String peso;
	public int quantidadeAssentos;
	public String tipoDeMotor;
	
	public Aviao (String modelo,String peso,int quantidadeAssentos)
	{
		this.modelo = modelo;
		this.peso = peso;
		this.quantidadeAssentos = quantidadeAssentos;
	}
	public void LigaAviao()
	{
		System.out.println("Ligando o motor...");
		System.out.println("Verificando o peso da aeronave...");
		System.out.println("Verificando se todos os passageiros e tripulantes estão usando cinto...");
		System.out.println("Decolando em 3... 2... 1...");
		System.out.println("Voando!!!");
	}

}
