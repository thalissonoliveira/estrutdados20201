package br.edu.fadam.estruturadedados.ead.aula2;

import java.util.ArrayList;

public class Node {

	private int valor;
	private Node pai;
	private ArrayList<Node> filhos;

	public Node() {
		valor = 0;
		pai = null;
		filhos = new ArrayList<Node>();
	}

	public Node(int v) {
		valor = v;
		pai = null;
		filhos = new ArrayList<Node>();

	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Node getPai() {
		return pai;
	}

	public void setPai(Node pai) {
		this.pai = pai;
	}

	public ArrayList<Node> getFilhos() {
		return filhos;
	}

	public void setFilhos(ArrayList<Node> filhos) {
		this.filhos = filhos;
	}
}