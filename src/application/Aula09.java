package application;

import entities.Vetor;

public class Aula09 {
	
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(3);
		
		vetor.adciona("B");
		vetor.adciona("C");
		vetor.adciona("E");
		vetor.adciona("F");
		vetor.adciona("G");
		
		System.out.println(vetor);
		
		vetor.remover(1);
		
		System.out.println(vetor);
		
		int pos = vetor.verificar("E");
		
		if (pos > -1) {
			vetor.remover(pos);
			
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		System.out.println(vetor);
	}

}
