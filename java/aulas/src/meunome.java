import java.util.Scanner;

public class meunome {
	
	public static void main (String[] args){
		
		//Instanciando (come�ando) um teclado
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento ;
		int idade ;
		String nome;
		double salario ;
		
		System.out.println("Digite o nome: ");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.println("Digite o sal�rio: ");
		salario = leia.nextDouble();
				
		
		System.out.println(nome);
		
		idade = 2020 - anoNascimento;
		//SA�DA
		System.out.printf("Meu nome � %s, a minha idade � %d anos, sou nascido em %d e o meu sal�rio � %.2f", nome, idade, anoNascimento, salario);
		
		
	}
	

}
