package aula_16_11;

import Entidades.Aviao;

public class Ex2 {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao("747","70000",300);
		
		System.out.printf("Olá passageiros, bem vindes. Nós estamos á bordo de um boeing %s . Ele é um avião de grande porte que pesa %s quilos e nós estamos com %d passageiros. Boa viagem.",aviao1.modelo,aviao1.peso, aviao1.quantidadeAssentos);
		aviao1.LigaAviao();
	}

}
