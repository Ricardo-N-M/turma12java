package Aplicacao;

import java.util.Scanner;

import Entidades.ContaPoupanca;

public class RickBank {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int limiteTransacao = 0;
		char escolha;

		System.out.println(
				"BEM VINDO AO BANCO GMR. POR FAVOR ESCOLHA O TIPO DE CONTA:\n[1] Conta Poupan�a.\n[2] Conta Especial.\n[3] Conta Corrente.");
		escolha = leia.next().charAt(0);

		if (escolha == '1') {
			double valor = 0;
			int numero, data, dia;
			String cpf;
			System.out.println("Digite o n�mero da conta: ");
			numero = leia.nextInt();
			System.out.println("Digite o cpf: ");
			cpf = leia.next();
			System.out.println("Digite o dia do seu anivers�rio: ");
			data = leia.nextInt();
			ContaPoupanca cp = new ContaPoupanca(numero, cpf, data);
			limpaTela();
			System.out.println("N�mero da conta: " + cp.getNumero());
			System.out.printf("Saldo: R$ %.2f", cp.getSaldo());
			System.out.println();
			for (limiteTransacao = 0; limiteTransacao < 5; limiteTransacao++) {
				System.out.println("\n\nTransa��o " + (limiteTransacao + 1));
				System.out.println("\nVoc� gostaria de fazer um cr�dito ou um d�bito?");
				escolha = leia.next().toUpperCase().charAt(0);
				if (escolha == 'C') {
					System.out.println("Voc� gostaria de creditar qual valor? ");
					valor = leia.nextDouble();
					cp.creditar(valor);
				} else if (escolha == 'D') {
					System.out.println("Voc� gostaria de debitar qual valor? ");
					valor = leia.nextDouble();
					if (cp.getSaldo() > valor) {
						cp.debitar(valor);
					} else {
						System.out.println("Valor acima do saldo.");
					}
				}
				System.out.printf("Saldo: R$ %.2f", cp.getSaldo());
			}
			System.out.println("\nDigite o dia de hoje: ");
			dia = leia.nextInt();
			if (dia == data) {
				cp.correcao(data);
			}
			limpaTela();
			System.out.println("N�mero da conta: " + cp.numero);
			System.out.println("CPF: " + cp.getCpf_cnpj());
			System.out.printf("Saldo: R$ %.2f", cp.getSaldo());

		}

	}

	public static void limpaTela() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

}
