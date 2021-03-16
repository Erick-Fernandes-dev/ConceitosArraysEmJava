package entities;

import java.util.Arrays;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = tamanho;
		
	}
	
	public Vetor() {
		
	}
//	ADCIONA UM VALOR DENTRO DE UM ARRAY
	public boolean adciona(String elemento) {
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		
		return false;
	}
	
//	VAI RETORNAR O TAMANHO DO ARRAY
	public int tamanho() {
		return this.tamanho;
		
	}
	
//	VAI PRINTAR TODOS OS ELEMENTOS DO ARRAY
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		
		s.append("[");
		
		for (int i = 0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
			
		}
		
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
//		return Arrays.toString(this.elementos);
		return s.toString();
	}
	

}
