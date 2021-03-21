package application;

import entities.Vetor;

public class Aula04 {
	
	public static void main(String[] args) {
//		REFERENTE A AULA 04
		Vetor vetor = new Vetor(10);
		
		vetor.adciona("elemento 1");
		vetor.adciona("elemento 2");
		vetor.adciona("elemento 3");
		
		System.out.println(vetor.tamanho());
		
		System.out.println(vetor);
	}
	
	
	

}
