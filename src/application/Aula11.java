package application;

import entities.Lista;

public class Aula11 {
	
	public static void main(String[] args) {
		
		Lista<String> vetor = new Lista<String>(1);
		Lista<Integer> vetor1 = new Lista<Integer>(2);
		Lista<Contato> vetor2 = new Lista<Contato>(1);
		
		vetor.adciona("Elemento 1");
		
		vetor1.adciona(1);
		
		Contato c1 = new Contato("Contato 1", "1234-6789", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2345-5678", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "3456-6789", "contato3@email.com");
	}

}
