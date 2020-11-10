import java.util.Scanner;
//Pedir nome, sexo(usando caractere), ano nascimento. Calcular idade
public class Exemplo_objeto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String nomeUsuario;
		char sexoUsuario;
		int anoNascimento, idade;
		
		System.out.println("Olá, digite o seu nome: ");
		nomeUsuario = teclado.next();
		System.out.println("Digite F-feminino, M-masculino ou O-outros:");
		sexoUsuario = teclado.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = teclado.nextInt();
		
		
				
		idade = 2020-anoNascimento;
		
		if (sexoUsuario =='M')
		{
			System.out.printf("Oi amigo %s, sua idade é %d anos.", nomeUsuario,idade);
		}
		else if(sexoUsuario == 'F')
		{
			System.out.printf("Oi amiga %s, sua idade é %d anos.", nomeUsuario,idade);
		}
		else 
		{
			System.out.printf("Oi amigx %s, sua idade é %d anos.", nomeUsuario,idade);
		}

	}

}
