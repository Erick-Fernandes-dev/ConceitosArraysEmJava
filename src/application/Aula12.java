package application;

import java.util.ArrayList;

public class Aula12 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
//		VAI ADCIONAR O ELEMENTO NO FINAL
		arrayList.add("A");
		arrayList.add("C");
		
		
		System.out.println(arrayList);
//		VAI ADCIONAR UM ELEMENTO EM QUALQUER POSICAO
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
//		PERGUNTA SE O ELEMENTO ESTA CONTIDO
//		CONTIDO = TRUE E NAO CONTIDO = FALSE
		boolean existe = arrayList.contains("A");
		
		if (existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento não existe no array");
		}
		
		
//		PEGA O ELEMENTO E RETORNA A SUA POSICAO
//		RETORNA 1 SE ESTIVER DENTRO DO ARRAY 
//		RETORNA -1 SE NAO ESTIVER DENTRO DO ARRAY
		int pos = arrayList.indexOf("B");
		if (pos > -1) {
			System.out.println("Elemento existe no array na pos " + pos);
		} else {
			System.out.println("Elemento não existe no array " + pos);
		}
		
//		BUSCA E RETORNA O ELEMENTO
		System.out.println(arrayList.get(2));
		
//		REMOVER ELEMENTOS
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
		
//		VAI RETORNAR O TAMANHO DE UM ARRAY
		System.out.println(arrayList.size());
	}

}
