package application;

import entities.Vetor;

public class Aula05 {
//	REFERENTE A AULA 05
	
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adciona("Elemento 1");//0
		vetor.adciona("Elemento 2");//1
		vetor.adciona("Elemento 3");//2
		
		System.out.println(vetor.busca(1));
		
		
	}

}
