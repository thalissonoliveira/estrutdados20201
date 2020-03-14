package br.edu.fadam.estruturadedados.aula4;

public class No {
	
	private String valor;
	private No proximo;
	
	public No() {
		super();
	}
	public No(String valor) {
		this.valor = valor;
	}
	public String getValor() {
		return valor;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	@Override
	public String toString() {
		return "No [valor=" + valor + ", proximo=" + proximo + "]";
	}
	
}
