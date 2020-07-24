package br.edu.fadam.estruturadedados.ead.aula2;

import java.util.ArrayList;

public class ArvoreGenerica {

	private Node raiz;

	public ArvoreGenerica() {
		raiz = null;
	}

	public Node raiz() {
		return raiz;

	}

	public ArrayList<Node> filhos(Node n) {
		return n.getFilhos();
	}

	public boolean verificaInterno(Node n) {
		int numeroFilhos = n.getFilhos().size();
		if (numeroFilhos == 0)
			return false;

		return true;
	}

	public boolean verificaExterno(Node n) {
		return !verificaInterno(n);
	}

	public boolean verificaRaiz(Node n) {
		if (n == raiz)
			return true;

		return false;

	}

	public ArrayList<Node> elementos() {
		ArrayList<Node> vetor = new ArrayList<Node>();

		vetor.add(raiz);

		int i = 0;

		// Navega pelo vetor adicionando os filhos. - Em Profundidade
		while (i < vetor.size()) {
			Node atual = vetor.get(i);
			for (Node n : atual.getFilhos()) {
				vetor.add(n);
			}
			i++;
		}
		return vetor;

	}

	public int tamanho() {
		return elementos().size();
	}

	public int atualizaElemento(Node antigo, Node novo) {
		int aux = antigo.getValor();
		antigo.setValor(novo.getValor());

		return aux;
	}

	public void insere(Node pai, Node filho) {
		if (raiz == null)
			raiz = filho;
		else {
			filho.setPai(pai);
			pai.getFilhos().add(filho);
		}
	}
	
	public static void main(String[] args) {
		
	}

}