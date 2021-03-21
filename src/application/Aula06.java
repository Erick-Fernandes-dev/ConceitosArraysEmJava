package application;

import entities.Vetor;

public class Aula06 {
	
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adciona("elemento 1");// 0
		vetor.adciona("elemento 2");// 1
		vetor.adciona("elemento 3");// 2
		
		
		System.out.println(vetor.verificar("elemento 1"));
		System.out.println(vetor.verificar("elemento 4"));
		
		
	}

}
