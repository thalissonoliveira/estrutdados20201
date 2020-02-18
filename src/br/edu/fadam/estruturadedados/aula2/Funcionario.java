package br.edu.fadam.estruturadedados.aula2;

public class Funcionario implements Pagavel {
	private String nome;
	private String numeroDocumento;
	private double salarioBase;
	
	public double calculaSalario(){
		return 0.0;
	}
	public double getSalarioBase() {
		return salarioBase;	
	}
	public void setSalarioBase (double salarioBase) {
		this.salarioBase = salarioBase;
	}
}
