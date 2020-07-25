package br.edu.fadam.estruturadedados.ead.aula4.revisao;

public class ArvoreBinaria {
	
	NoBinario raiz;

	/*
	 * O construtor recebendo raiz nula
	 * garante que a �rvore bin�ria �
	 * inicializada sendo vazia
	 */
	public ArvoreBinaria() {
		raiz = null;
	}
	
	/*
	 * Para que a �rvore seja dita como vazia,
	 * ela n�o dele ter um n� raiz "setado".
	 * 
	 * Se a raiz for nula, a �rvore � dita vazia
	 * Caso contr�rio, ela tem elementos
	 */
	boolean isArvoreVazia() {
		if (raiz == null) {
			return true;
		} else {
			return false;
		}
	}
	//EX = raiz valor 7
	//adicionar 3
	//adicionar 2
	//adicionar 10
	//adicionar 11
	//adicionar 4
	void adicionar(NoBinario no) {
		if (isArvoreVazia()) {
			raiz = no;
		} else {
			adicionar(no, raiz);
		}
	}

	private void adicionar(NoBinario no, NoBinario raiz) {
		if (no.valor < raiz.valor) {
			if (raiz.saEsquerdo == null) {
				raiz.saEsquerdo = no;
			} else {
				adicionar(no, raiz.saEsquerdo);
			}
		} 
			//Esse if s� existe para ignorar os iguais
		if (no.valor > raiz.valor) {
			if (raiz.saDireito == null) {
				raiz.saDireito = no;
			} else {
				adicionar(no, raiz.saDireito);
			}
		}
		
	}
	
	void percorrerPreOrdem() {
		System.out.println();
		System.out.println("Percorrendo Pr� Ordem");
		percorrerPreOrdem(raiz);
	}
	//7 - 
	
	
	public void percorrerPreOrdem(NoBinario no) {
	    if(no != null){
	        System.out.print(no.valor + " ");
	        percorrerPreOrdem(no.saEsquerdo);
	        percorrerPreOrdem(no.saDireito);
	    }
	}
	
	void percorrerEmOrdem() {
		System.out.println();
		System.out.println("Percorrendo Em Ordem");
		percorrerEmOrdem(raiz);
	}
	
	public void percorrerEmOrdem(NoBinario no) {
		if(no != null){
			percorrerEmOrdem(no.saEsquerdo);
			System.out.print(no.valor + " ");
			percorrerEmOrdem(no.saDireito);
		}
	}
	
	void percorrerPosOrdem() {
		System.out.println();
		System.out.println("Percorrendo P�s Ordem");
		percorrerPosOrdem(raiz);
	}
	
	public void percorrerPosOrdem(NoBinario no) {
		if(no != null){
			percorrerPosOrdem(no.saEsquerdo);
			percorrerPosOrdem(no.saDireito);
			System.out.print(no.valor + " ");
		}
	}
	
}
