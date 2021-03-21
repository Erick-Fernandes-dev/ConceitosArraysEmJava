package application;

import entities.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contato 1", "1234-6789", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2345-5678", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "3456-6789", "contato3@email.com");
		
		Contato c4 = new Contato("Contato 1", "1234-6789", "contato1@email.com");
		
		vetor.adciona(c1);
		vetor.adciona(c2);
		vetor.adciona(c3);
		
		System.out.println("Tamanho do vetor = " + vetor.tamanho());
		
		System.out.println(vetor);
		
		int pos = vetor.verificar(c4);
		
		if (pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
//		vetor.adciona(3);
//		vetor.adciona(4);
//		vetor.adciona(5);
//		
//		
//		System.out.println("Tamanho vetor = " + vetor.tamanho());
//		
//		System.out.println(vetor);
		
		
		

	}

}
