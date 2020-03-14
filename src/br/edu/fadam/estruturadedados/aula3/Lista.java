package br.edu.fadam.estruturadedados.aula3;

public class Lista {
	
	private Produto[] produtos = new Produto[10];
	private int quantidade;
	
	/**
	 * Adiciona aluno no final do vetor.
	 * 
	 * @param aluno
	 */
	public void inserirNaUltimaPosicao(Produto produto) {
		produtos[quantidade] = produto;
		quantidade = quantidade + 1;
	}
	
	public void removeDoFinal() {
		produtos[quantidade - 1] = null;
		quantidade = quantidade - 1;
	}
	
	/**
	 * Percorre SEMPRE todos os elementos do array
	 */
	public void removeInicioOld() {
		for (int i = 0; i < produtos.length - 1; i++) {
			produtos[i] = produtos[i+1];
		}
		produtos[produtos.length - 1] = null;
	}
	
	/**
	 * Percorre apenas os elementos do array que contêm valor
	 */
	public void removeInicio() {
		for (int i = 0; i < quantidade - 1; i++) {
			produtos[i] = produtos[i+1];
		}
		produtos[quantidade - 1] = null;
		quantidade = quantidade - 1;
	}
	
	public void imprimeValoresArray() {
		for (int i = 0; i <= produtos.length-1; i++) {
			System.out.println("produto indice " + i + " = " + produtos[i]);
		}
	}
	
	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.inserirNaUltimaPosicao(new Produto("P1", "p1", 100.0));
		lista.inserirNaUltimaPosicao(new Produto("P2", "p2", 100.0));
		lista.inserirNaUltimaPosicao(new Produto("P3", "p3", 100.0));
		lista.inserirNaUltimaPosicao(new Produto("P4", "p4", 100.0));
		lista.inserirNaUltimaPosicao(new Produto("P5", "p5", 100.0));
		lista.inserirNaUltimaPosicao(new Produto("P6", "p6", 100.0));
		lista.inserirNaUltimaPosicao(new Produto("P7", "p7", 100.0));
		lista.inserirNaUltimaPosicao(new Produto("P8", "p8", 100.0));
		lista.imprimeValoresArray();
		lista.removeInicio();
		System.out.println("quantidade: " + lista.quantidade);
		System.out.println("###############");
		lista.imprimeValoresArray();
		System.out.println("quantidade 2: " + lista.quantidade);
	}
	

}
