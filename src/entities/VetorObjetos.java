package entities;

public class VetorObjetos {
	
	private Object[] elementos;
	private int tamanho;
	
	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
		
	}
	
	public VetorObjetos() {
		
	}
//	ADCIONA UM VALOR DENTRO DE UM ARRAY
	public boolean adciona(Object elemento) {
		
		this.aumentaCapacidade();
		
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
	
//	BUSCAR POSICAO E MOSTRA O ELEMENTO
	public Object busca(int posicao) {
		
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
			
		}
		return this.elementos[posicao];
	}
	
//	VAI RETORNAR A POSIÇÃO DO ELEMENTO
	public int verificar(Object elemento) {
		
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		
		return -1;
	}
	
	
//	ADD ELEMENTO EM QUALQUER POSIÇÃO
	
	public boolean adciona(int posicao, Object elemento) {
		
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		this.aumentaCapacidade();
		
//		MOVER TODOS OS ELEMENTOS
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
			
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return false;
	}
	
//	AUMENTAR A CAPACIDADE DO VETOR
	private void aumentaCapacidade() {
		
		if (this.tamanho == this.elementos.length) {
			Object[] elementosNovos = new Object[this.elementos.length * 2];
			
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
				
			}
			
			this.elementos = elementosNovos;
		}
	}
	
	public void remover(int posicao) {
		
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		for (int i = posicao; i < this.elementos.length - 1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		
		this.tamanho--;
	}

}
