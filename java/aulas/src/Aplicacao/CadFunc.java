package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Funcionario1;
import Entidades.Terceiro;

public class CadFunc {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		List<Funcionario1> cadastro = new ArrayList<>();
		
		System.out.println("Digite o número de funcionários á serem cadastrados: ");
		numero = leia.nextInt();
		for(int x = 1; x<=numero;x++)
		{
			System.out.println("Empregado"+x);
			System.out.println("Terceiro S/N: ");
			char resposta = leia.next().toUpperCase().charAt(0);
			System.out.println("Digite e matrícula do funcionário: ");
			String codigo = leia.next();
			System.out.println("Digite as horas: ");
			double horas = leia.nextDouble();
			System.out.println("Digite o valor/hora: ");
			double valorHora = leia.nextDouble();
			if(resposta =='S')
			{
				System.out.println("Digite o valor adicional: ");
				double adicional = leia.nextDouble();
				cadastro.add(new Terceiro(codigo, horas, valorHora,adicional));
			}else 
			{
				cadastro.add(new Funcionario1(codigo, horas, valorHora));
			}
		}
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTOS: ");
		for (Funcionario1 func: cadastro)
		{
			System.out.println(func.getCodigo()+ " - "+ String.format("%.2f", func.pagamentoSalario()));
		}
	}

}
