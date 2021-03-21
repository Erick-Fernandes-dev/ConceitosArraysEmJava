package entities;

import java.lang.reflect.Array;

public class Lista<T> {
	
	private T[] elementos;
	private int tamanho;
	
	
//	MELHOR SOLUCAO
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];//SOLUCAO DO LIVRO JAVA EFFECTS
		this.tamanho = 0;
	}
	
	
//	UMA DAS FORMAS DE SE FAZER COM REFLETION
//	public Lista(int capacidade, Class<T> tipoClasse) {
//		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
//		this.tamanho = 0;
//	}
	
	
	
	public Lista() {
		
	}
	
	public boolean adciona(T elemento) {
		
		this.aumentarCapacidade();
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		
		return false;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		
		s.append("[");
		
		for(int i = 0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		return s.toString();
	}
	
	public T busca(int posicao) {
		
		if (!(posicao >= 0 && posicao <= this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
			
		}
		
		
		return this.elementos[posicao];
	}
	
	public int verifica(T elemento) {
		
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean adciona(int posicao, T elemento) {
		
		if (!(posicao >= 0 && posicao <= this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		this.aumentarCapacidade();
		
		for (int i = this.tamanho -1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return false;
	}
	
	public void aumentarCapacidade() {
		
		if (this.tamanho == this.elementos.length) {
			
			T[] elementoNovo = (T[]) new Object[this.elementos.length * 2];
			
			for (int i = 0; i < this.tamanho; i++) {
				elementoNovo[i] = this.elementos[i];
			}
			
			this.elementos = elementoNovo;
		}
	}
	
	public void remover(int posicao) {
		
		if (!(posicao >= 0 && posicao <= this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		for (int i = posicao; i < this.elementos.length - 1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		
		this.tamanho--;
	}
	
}
