package application;

import entities.Vetor;

public class Aula07 {
	
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adciona("B");
		vetor.adciona("C");
		vetor.adciona("E");
		vetor.adciona("F");
		vetor.adciona("G");
		
		System.out.println(vetor);
		
		vetor.adciona(0, "A");
		
		System.out.println(vetor);
		
		vetor.adciona(3, "D");
		System.out.println(vetor);
	}

}
