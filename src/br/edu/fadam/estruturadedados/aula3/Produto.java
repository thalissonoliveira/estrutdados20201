package br.edu.fadam.estruturadedados.aula3;

public class Produto {
	
	private String nome;
	private String codigo;
	private double valor;
	
	public Produto() {
		super();
	}
	
	public Produto(String nome, String codigo, double valor) {
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", codigo=" + codigo + ", valor=" + valor + "]";
	}
	
}
