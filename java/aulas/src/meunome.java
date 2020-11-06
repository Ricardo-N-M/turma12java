import java.util.Scanner;

public class meunome {
	
	public static void main (String[] args){
		
		//Instanciando (começando) um teclado
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento ;
		int idade ;
		String nome;
		double salario ;
		
		System.out.println("Digite o nome: ");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.println("Digite o salário: ");
		salario = leia.nextDouble();
				
		
		System.out.println(nome);
		
		idade = 2020 - anoNascimento;
		//SAÍDA
		System.out.printf("Meu nome é %s, a minha idade é %d anos, sou nascido em %d e o meu salário é %.2f", nome, idade, anoNascimento, salario);
		
		
	}
	

}
